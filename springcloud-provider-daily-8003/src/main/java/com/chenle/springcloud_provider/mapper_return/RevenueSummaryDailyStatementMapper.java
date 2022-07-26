package com.chenle.springcloud_provider.mapper_return;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chenle.springcloudapi.entity_return.RevenueSummaryDailyStatement;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RevenueSummaryDailyStatementMapper extends BaseMapper<RevenueSummaryDailyStatement> {

    @Select(
            "select 序号 as xuhao, 公众号售票 as gshoupiao,公众号售票-公众号当日退款 as gxiaofei,公众号当日退款 as gdangrituikuan,公众号待退款 as gdaituikuan,\n" +
                    "       现金押金 as zxianjinyajin,现金充值 as zxianjincongzhi,电子支付押金 as zdianzizhifuyajin,电子支付充值 as zdianzizhifucongzhi,退款押金 as rtuikuanyajin,退款金额 as rtuikuanjine,现金押金+现金充值-退款押金-退款金额 as   xianjinshouru,公众号售票-公众号当日退款+电子支付充值+电子支付押金 as feixianjinshouru,\n" +
                    "       现金押金+现金充值-退款押金-退款金额+公众号售票-公众号当日退款+电子支付充值+电子支付押金 as zongji\n" +
                    "from(\n" +
                    "\n" +
                    "    SELECT @rownum:=@rownum+1 AS 序号,a.*\n" +
                    "    FROM\n" +
                    "        (select create_time,\n" +
                    "                sum(CASE\n" +
                    "                    WHEN pay_union.order_type=30 and pay_union.order_status=1\n" +
                    "                    THEN pay_union.total_fee ELSE 0 END) as \"公众号售票\",\n" +
                    "                sum(CASE\n" +
                    "                    WHEN pay_union.order_type=30 and pay_union.order_status=2\n" +
                    "                    THEN pay_union.total_fee ELSE 0 END) as \"公众号当日退款\",\n" +
                    "                sum(CASE\n" +
                    "                    WHEN pay_union.order_type=30 and pay_union.order_status=2\n" +
                    "                    THEN pay_union.total_fee ELSE 0 END) as \"公众号待退款\",\n" +
                    "                sum(CASE\n" +
                    "                    WHEN data_type=0\n" +
                    "                    THEN deposit ELSE 0 END) as \"现金押金\",\n" +
                    "                sum(CASE\n" +
                    "                    WHEN data_type=0 and trans_type=5\n" +
                    "                    THEN trans_amount ELSE 0 END) as \"现金充值\",\n" +
                    "                sum(CASE\n" +
                    "                    WHEN data_type=1\n" +
                    "                    THEN deposit ELSE 0 END) as \"电子支付押金\",\n" +
                    "                sum(CASE\n" +
                    "                    WHEN data_type=1 and trans_type=5\n" +
                    "                    THEN trans_amount ELSE 0 END) as \"电子支付充值\",\n" +
                    "                sum(CASE\n" +
                    "                    WHEN trans_type=4\n" +
                    "                    THEN deposit ELSE 0 END) as \"退款押金\",\n" +
                    "                sum(CASE\n" +
                    "                    WHEN trans_type=4\n" +
                    "                    THEN trans_amount ELSE 0 END) as \"退款金额\"\n" +
                    "\n" +
                    "        from pay_union ,trans_record\n" +
                    "        where trans_record.trans_time > #{start} and trans_record.trans_time < #{end}\n" +
                    "\n" +
                    "             ) a,\n" +
                    "        (select @rownum:=0) r\n" +
                    "\n" +
                    "        )\n" +
                    "as aaaa"
    )
    RevenueSummaryDailyStatement[] getlist(String start, String end);
}

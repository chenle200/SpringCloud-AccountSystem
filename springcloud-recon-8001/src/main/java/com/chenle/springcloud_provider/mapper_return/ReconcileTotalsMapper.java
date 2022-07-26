package com.chenle.springcloud_provider.mapper_return;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chenle.springcloudapi.entity_return.ReconcileTotals;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ReconcileTotalsMapper extends BaseMapper<ReconcileTotals> {

    @Select(
            "select trans_time as date,\n" +
                    "       a.邮储支付统计收入金额 as yshourujine, a.邮储支付统计退款金额 as ytuikuanjine, a.邮储支付统计总金额 as yzongjine, a.邮储支付统计总笔数 as yzongbishu,\n" +
                    "       b.系统支付统计收入金额 as xshourujine, b.系统支付统计退款金额 as xtuikuanjine, b.系统支付统计总金额 as xzongjine, b.系统支付统计总笔数 as xzongbishu\n" +
                    "    from (select sum(total_fee) as \"邮储支付统计收入金额\",\n" +
                    "                 sum(case order_status when 2 then downloaded_bill1.total_fee else 0 end) as \"邮储支付统计退款金额\",\n" +
                    "                 sum(case order_status when 1 then downloaded_bill1.total_fee else 0 end) as \"邮储支付统计总金额\",\n" +
                    "                 count(out_trade_no) as \"邮储支付统计总笔数\",trans_time\n" +
                    "          from downloaded_bill1\n" +
                    "          where trans_time > #{start} and trans_time < #{end}) a,\n" +
                    "         (select sum(total_fee) as \"系统支付统计收入金额\",\n" +
                    "                 sum(case order_status when 2 then pay_union.total_fee else 0 end) as \"系统支付统计退款金额\",\n" +
                    "                 sum(case order_status when 1 then pay_union.total_fee else 0 end) as \"系统支付统计总金额\",\n" +
                    "                 count(out_trade_no) as \"系统支付统计总笔数\"\n" +
                    "         from pay_union\n" +
                    "         where create_time > #{start} and create_time < #{end}) b"
    )
    ReconcileTotals[] getlist(String start, String end);
}

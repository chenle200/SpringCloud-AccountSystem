package com.chenle.springcloud_provider.mapper_return;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chenle.springcloudapi.entity_return.Reconciliation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ReconciliationMapper extends BaseMapper<Reconciliation> {

    @Select("select d.out_trade_no as shuanghudingdanhao, d.trans_time as jiaoyishijian,d.order_type as yzhifufangshi,d.order_status as yzhifuzhuangtai,d.total_fee as yzhongjine,out_refund_no as ytuikuanshangjiadindanhao,refund_status as ytuikuanzhuantai,pu.order_type as xzhifufangshi,pu.order_status as xzhifuzhuangtai,pu.total_fee as xzhongjine,tr.trans_amount as jiaoyijie,tr.trans_sn as jiaoyiliushuihao \n" +
            "from downloaded_bill1 d join pay_union pu on d.out_trade_no = pu.out_trade_no left join trans_record1 tr on tr.trans_time = d.trans_time\n" +
            "where d.trans_time > #{start} and d.trans_time < #{end}")
    Reconciliation[] getlist(String start,String end);
}

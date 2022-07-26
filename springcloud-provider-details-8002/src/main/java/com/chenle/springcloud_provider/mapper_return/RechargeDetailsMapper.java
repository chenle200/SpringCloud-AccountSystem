package com.chenle.springcloud_provider.mapper_return;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chenle.springcloudapi.entity_return.RechargeDetails;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RechargeDetailsMapper extends BaseMapper<RechargeDetails> {
    @Select("SELECT @rownum:=@rownum+1 AS xuhao,a.*\n" +
            "FROM\n" +
            "     (select trans_sn as jiaoyiliushuihao ,trans_type as jiaoyileixingInt,card_no as kahao,card_issuer as fakajigou,ticket_type as piaokaleixingInt,trans_time as chongzhishijian,balance as chongzhiqianyue,trans_amount as chongzhijine,discount as youhuijine,line_id as chongzhidian,user_id as caozuoyuna from trans_record where trans_type=5 and trans_time > #{start} and trans_time < #{end}) a,\n" +
            "     (select @rownum:=0) r")
    RechargeDetails[] getlist(String start, String end);
}
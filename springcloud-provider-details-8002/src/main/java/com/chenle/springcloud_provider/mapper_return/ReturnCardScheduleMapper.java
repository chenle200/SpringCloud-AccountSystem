package com.chenle.springcloud_provider.mapper_return;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chenle.springcloudapi.entity_return.ReturnCardSchedule;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ReturnCardScheduleMapper extends BaseMapper<ReturnCardSchedule> {

    @Select("SELECT @rownum:=@rownum+1 AS xuhao,a.*\n" +
            "FROM\n" +
            "     (select trans_sn as jiaoyiliushuihao,trans_type as jiaoyileixingInt,card_no as kahao,card_issuer as fakajigou,ticket_type as piaokaleixingInt,trans_time as tuikashijian,balance as yajin,trans_amount as yue,discount as tuikuanjine,line_id  as tuikadian,user_id as caozuoyuna from trans_record where trans_type=4 and trans_time > #{start} and trans_time < #{end}) a,\n" +
            "     (select @rownum:=0) r")
    ReturnCardSchedule[] getlist(String start, String end);
}

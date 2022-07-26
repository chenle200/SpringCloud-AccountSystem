package com.chenle.springcloud_provider.mapper_return;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chenle.springcloudapi.entity_return.SwipeTransactionSchedule;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SwipeTransactionScheduleMapper extends BaseMapper<SwipeTransactionSchedule> {

    @Select("SELECT @rownum:=@rownum+1 AS xuhao,a.*\n" +
            "FROM\n" +
            "     (select trans_sn as jiaoyiliushuihao,card_no as kahao,card_issuer as fakajigou,ticket_type as piaokaleixingInt,trans_time as jiaoyishijian,trans_type as jiaoyileixingInt,balance as jiaoyiqianjine,trans_amount as jiaoyijine,discount as youhuijine,offline_trans_index as zongduanjiaoyixulei,terminal_no as zongduanbianhao,tac as TAC\n" +
            "     from trans_record\n" +
            "     where data_type=0 and trans_type=0 and trans_time > #{start} and trans_time < #{end}) a,\n" +
            "     (select @rownum:=0) r"
    )
    SwipeTransactionSchedule[] getlist(String start, String end);
}

package com.chenle.springcloud_provider.mapper_return;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.chenle.springcloudapi.entity_return.OperatorStatistics;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OperatorStatisticsMapper extends BaseMapper<OperatorStatistics> {

    @Select("\n" +
            "select 序号 as xuhao, trans_time as date, line_id as chongzhidian, user_id as caozuoyuan, 售卡金额+充值金额-退卡金额 as zjine, 售卡次数+充值次数+退卡次数 as zcishu, 售卡金额 as sjine, 售卡次数 as  scishu, 充值金额 as cjine, 充值次数 as ccishu, 退卡金额 as tjine, 退卡次数 as tcishu\n" +
            "from(\n" +
            "\n" +
            "    SELECT @rownum:=@rownum+1 AS 序号,a.*\n" +
            "    FROM\n" +
            "        (select trans_time,line_id,user_id,\n" +
            "\n" +
            "             sum(CASE trans_type WHEN 3 THEN trans_amount ELSE 0 END) as \"售卡金额\",\n" +
            "             sum(CASE trans_type WHEN 3 THEN 1 ELSE 0 END) as \"售卡次数\",\n" +
            "             sum(CASE trans_type WHEN 5 THEN trans_amount ELSE 0 END) as \"充值金额\",\n" +
            "             sum(CASE trans_type WHEN 5 THEN 1 ELSE 0 END) as \"充值次数\",\n" +
            "             sum(CASE trans_type WHEN 4 THEN trans_amount ELSE 0 END) as \"退卡金额\",\n" +
            "             sum(CASE trans_type WHEN 4 THEN 1 ELSE 0 END) as \"退卡次数\"\n" +
            "        from trans_record\n" +
            "        where trans_time > #{start} and trans_time < #{end}\n" +
            "        group by user_id\n" +
            "             ) a,\n" +
            "        (select @rownum:=0) r\n" +
            "\n" +
            "        )\n" +
            "as aaaa\n" +
            "where 售卡次数+充值次数+退卡次数>0")
    OperatorStatistics[] getlist(String start,String end);
}

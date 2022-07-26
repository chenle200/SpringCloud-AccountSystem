package com.chenle.springcloud_provider.mapper_return;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chenle.springcloudapi.entity_return.BOMDailyRevenue;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BOMDailyRevenueMapper extends BaseMapper<BOMDailyRevenue> {
    @Select(
            "select 序号 as xuhao, line_id as chongzhidian, terminal_no as shebeibianhao,\n" +
                    "       储值卡售卡押金+储值卡充值金额-储值卡退卡金额+普通卡售卡押金+普通卡充值金额-普通卡退卡金额+学生卡售卡押金+学生卡充值金额-学生卡退卡金额+关爱卡售卡押金+关爱卡充值金额-关爱卡退卡金额+计次卡售卡押金+计次卡充值金额-计次卡退卡金额 as heji,\n" +
                    "       储值卡售卡次数 as cfashoushu,储值卡售卡押金 as cyajin,储值卡充值次数 as cchongzhicishu,储值卡充值金额 as cchongzhijine,储值卡退卡次数 as ctuikashu,储值卡退卡金额 as ctuikuanyajin,\n" +
                    "       普通卡售卡次数 as pfashoushu,普通卡售卡押金 as pyajin,普通卡充值次数 as pchongzhicishu,普通卡充值金额 as pchongzhijine,普通卡退卡次数 as ptuikashu,普通卡退卡金额 as ptuikuanyajin,\n" +
                    "       学生卡售卡次数 as xfashoushu,学生卡售卡押金 as xyajin,学生卡充值次数 as xchongzhicishu,学生卡充值金额 as xchongzhijine,学生卡退卡次数 as xtuikashu,学生卡退卡金额 as xtuikuanyajin,\n" +
                    "       关爱卡售卡次数 as afashoushu,关爱卡售卡押金 as ayajin,关爱卡充值次数 as achongzhicishu,关爱卡充值金额 as achongzhijine,关爱卡退卡次数 as atuikashu,关爱卡退卡金额 as atuikuanyajin,\n" +
                    "       计次卡售卡次数 as jfashoushu,计次卡售卡押金 as jyajin,计次卡充值次数 as jchongzhicishu,计次卡充值金额 as jchongzhijine,计次卡退卡次数 as jtuikashu,计次卡退卡金额 as jtuikuanyajin\n" +
                    "from(\n" +
                    "\n" +
                    "    SELECT @rownum:=@rownum+1 AS 序号,a.*\n" +
                    "    FROM\n" +
                    "        (select line_id,terminal_no,\n" +
                    "             sum(CASE\n" +
                    "                 WHEN trans_type = 3 and ticket_type = 80\n" +
                    "                 THEN deposit ELSE 0 END) as \"储值卡售卡押金\",\n" +
                    "             sum(CASE\n" +
                    "                 WHEN trans_type = 3 and ticket_type = 80\n" +
                    "                 THEN 1 ELSE 0 END) as \"储值卡售卡次数\",\n" +
                    "             sum(CASE\n" +
                    "                 WHEN trans_type = 5 and ticket_type = 80\n" +
                    "                 THEN 1 ELSE 0 END) as \"储值卡充值次数\",\n" +
                    "             sum(CASE\n" +
                    "                 WHEN trans_type = 5 and ticket_type = 80\n" +
                    "                 THEN trans_amount ELSE 0 END) as \"储值卡充值金额\",\n" +
                    "             sum(CASE\n" +
                    "                 WHEN trans_type = 4 and ticket_type = 80\n" +
                    "                 THEN 1 ELSE 0 END) as \"储值卡退卡次数\",\n" +
                    "             sum(CASE\n" +
                    "                 WHEN trans_type = 4 and ticket_type = 80\n" +
                    "                 THEN trans_amount ELSE 0 END) as \"储值卡退卡金额\",\n" +
                    "             sum(CASE\n" +
                    "                 WHEN trans_type = 3 and ticket_type = 81\n" +
                    "                 THEN deposit ELSE 0 END) as \"普通卡售卡押金\",\n" +
                    "             sum(CASE\n" +
                    "                 WHEN trans_type = 3 and ticket_type = 81\n" +
                    "                 THEN 1 ELSE 0 END) as \"普通卡售卡次数\",\n" +
                    "             sum(CASE\n" +
                    "                 WHEN trans_type = 5 and ticket_type = 81\n" +
                    "                 THEN 1 ELSE 0 END) as \"普通卡充值次数\",\n" +
                    "             sum(CASE\n" +
                    "                 WHEN trans_type = 5 and ticket_type = 81\n" +
                    "                 THEN trans_amount ELSE 0 END) as \"普通卡充值金额\",\n" +
                    "             sum(CASE\n" +
                    "                 WHEN trans_type = 4 and ticket_type = 81\n" +
                    "                 THEN 1 ELSE 0 END) as \"普通卡退卡次数\",\n" +
                    "             sum(CASE\n" +
                    "                 WHEN trans_type = 4 and ticket_type = 81\n" +
                    "                 THEN trans_amount ELSE 0 END) as \"普通卡退卡金额\",\n" +
                    "             sum(CASE\n" +
                    "                 WHEN trans_type = 3 and ticket_type = 82\n" +
                    "                 THEN deposit ELSE 0 END) as \"学生卡售卡押金\",\n" +
                    "             sum(CASE\n" +
                    "                 WHEN trans_type = 3 and ticket_type = 82\n" +
                    "                 THEN 1 ELSE 0 END) as \"学生卡售卡次数\",\n" +
                    "             sum(CASE\n" +
                    "                 WHEN trans_type = 5 and ticket_type = 82\n" +
                    "                 THEN 1 ELSE 0 END) as \"学生卡充值次数\",\n" +
                    "             sum(CASE\n" +
                    "                 WHEN trans_type = 5 and ticket_type = 82\n" +
                    "                 THEN trans_amount ELSE 0 END) as \"学生卡充值金额\",\n" +
                    "             sum(CASE\n" +
                    "                 WHEN trans_type = 4 and ticket_type = 82\n" +
                    "                 THEN 1 ELSE 0 END) as \"学生卡退卡次数\",\n" +
                    "             sum(CASE\n" +
                    "                 WHEN trans_type = 4 and ticket_type = 82\n" +
                    "                 THEN trans_amount ELSE 0 END) as \"学生卡退卡金额\",\n" +
                    "             sum(CASE\n" +
                    "                 WHEN trans_type = 3 and ticket_type = 84\n" +
                    "                 THEN deposit ELSE 0 END) as \"关爱卡售卡押金\",\n" +
                    "             sum(CASE\n" +
                    "                 WHEN trans_type = 3 and ticket_type = 84\n" +
                    "                 THEN 1 ELSE 0 END) as \"关爱卡售卡次数\",\n" +
                    "             sum(CASE\n" +
                    "                 WHEN trans_type = 5 and ticket_type = 84\n" +
                    "                 THEN 1 ELSE 0 END) as \"关爱卡充值次数\",\n" +
                    "             sum(CASE\n" +
                    "                 WHEN trans_type = 5 and ticket_type = 84\n" +
                    "                 THEN trans_amount ELSE 0 END) as \"关爱卡充值金额\",\n" +
                    "             sum(CASE\n" +
                    "                 WHEN trans_type = 4 and ticket_type = 84\n" +
                    "                 THEN 1 ELSE 0 END) as \"关爱卡退卡次数\",\n" +
                    "             sum(CASE\n" +
                    "                 WHEN trans_type = 4 and ticket_type = 84\n" +
                    "                 THEN trans_amount ELSE 0 END) as \"关爱卡退卡金额\",\n" +
                    "             sum(CASE\n" +
                    "                 WHEN trans_type = 3 and ticket_type = 1\n" +
                    "                 THEN deposit ELSE 0 END) as \"计次卡售卡押金\",\n" +
                    "             sum(CASE\n" +
                    "                 WHEN trans_type = 3 and ticket_type = 1\n" +
                    "                 THEN 1 ELSE 0 END) as \"计次卡售卡次数\",\n" +
                    "             sum(CASE\n" +
                    "                 WHEN trans_type = 5 and ticket_type = 1\n" +
                    "                 THEN 1 ELSE 0 END) as \"计次卡充值次数\",\n" +
                    "             sum(CASE\n" +
                    "                 WHEN trans_type = 5 and ticket_type = 1\n" +
                    "                 THEN trans_amount ELSE 0 END) as \"计次卡充值金额\",\n" +
                    "             sum(CASE\n" +
                    "                 WHEN trans_type = 4 and ticket_type = 1\n" +
                    "                 THEN 1 ELSE 0 END) as \"计次卡退卡次数\",\n" +
                    "             sum(CASE\n" +
                    "                 WHEN trans_type = 4 and ticket_type = 1\n" +
                    "                 THEN trans_amount ELSE 0 END) as \"计次卡退卡金额\"\n" +
                    "\n" +
                    "        from trans_record\n" +
                    "        where trans_time > #{start} and trans_time < #{end}\n" +
                    "        group by user_id\n" +
                    "             ) a,\n" +
                    "        (select @rownum:=0) r\n" +
                    "\n" +
                    "        ) as `序a.*`\n" +
                    "where 储值卡售卡押金+储值卡充值金额-储值卡退卡金额+普通卡售卡押金+普通卡充值金额-普通卡退卡金额+学生卡售卡押金+学生卡充值金额-学生卡退卡金额+关爱卡售卡押金+关爱卡充值金额-关爱卡退卡金额+计次卡售卡押金+计次卡充值金额-计次卡退卡金额>0"
    )
    BOMDailyRevenue[] getlist(String start, String end);


}

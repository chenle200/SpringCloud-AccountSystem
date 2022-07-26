package com.chenle.springcloud_provider.controller;


import com.chenle.springcloud_provider.mapper_return.OperatorStatisticsMapper;
import com.chenle.springcloudapi.common.R;
import com.chenle.springcloudapi.entity_return.BOMDailyRevenue;
import com.chenle.springcloudapi.entity_return.OperatorStatistics;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@Slf4j
@RestController
@RequestMapping("/api/OperatorStatistics")
public class OperatorStatisticsController {

    @Autowired
    OperatorStatisticsMapper operatorStatisticsMapper;

    @GetMapping("/list")
    public OperatorStatistics[] getList(String start, String end){
        OperatorStatistics[] operatorStatistics = operatorStatisticsMapper.getlist(start, end);
        int i = 1;
        for (OperatorStatistics b :
                operatorStatistics   ) {
            b.setXuhao(i++);
        }
        return operatorStatistics;
    }
}

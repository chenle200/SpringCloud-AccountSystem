package com.chenle.springcloud_provider.controller;


import com.chenle.springcloud_provider.mapper_return.BOMDailyRevenueMapper;
import com.chenle.springcloudapi.entity_return.BOMDailyRevenue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@Slf4j
@RestController
@RequestMapping("/api/BOMDailyRevenue")
public class BOMDailyRevenueController {

    @Autowired
    BOMDailyRevenueMapper bomDailyRevenueMapper;

    @GetMapping("/list")
    public BOMDailyRevenue[] getList(String start, String end){
        log.info(start);
        BOMDailyRevenue[] bomDailyRevenues = bomDailyRevenueMapper.getlist(start, end);
        int i = 1;
        for (BOMDailyRevenue b :
                bomDailyRevenues   ) {
            b.setXuhao(i++);
        }
        return bomDailyRevenues;
    }
}

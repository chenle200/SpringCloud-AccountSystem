package com.chenle.springcloud_consumer.controller;



import com.chenle.springcloudapi.common.R;
import com.chenle.springcloudapi.entity.Employee;
import com.chenle.springcloudapi.entity_return.BOMDailyRevenue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/BOMDailyRevenue")
public class BOMDailyRevenueController {
    @Autowired
    private RestTemplate restTemplate;
    private static final String REST_URL_PREFIX = "http://springcloud-daily";
    //http://SPRINGCLOUD-PROVIDER/api/BOMDailyRevenue/list/?start=2000-1-1&end=2022-2-2
    @GetMapping("/list")
    public BOMDailyRevenue[] getList(String start, String end){
        return restTemplate.getForObject(REST_URL_PREFIX+"/api/BOMDailyRevenue/list/?start="+start+"&end="+end, new BOMDailyRevenue[1].getClass());
    }

}

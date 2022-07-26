package com.chenle.springcloud_consumer.controller;



import com.chenle.springcloudapi.common.R;
import com.chenle.springcloudapi.entity_return.BOMDailyRevenue;
import com.chenle.springcloudapi.entity_return.CardSalesSchedule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@Slf4j
@RestController
@RequestMapping("/api/CardSalesSchedule")
public class CardSalesScheduleController {

    @Autowired
    private RestTemplate restTemplate;
    private static final String REST_URL_PREFIX = "http://springcloud-details";
    //http://SPRINGCLOUD-PROVIDER/api/BOMDailyRevenue/list/?start=2000-1-1&end=2022-2-2
    @GetMapping("/list")
    public CardSalesSchedule[] getList(String start, String end){
        return restTemplate.getForObject(REST_URL_PREFIX+"/api/CardSalesSchedule/list/?start="+start+"&end="+end, new CardSalesSchedule[1].getClass());
    }
}

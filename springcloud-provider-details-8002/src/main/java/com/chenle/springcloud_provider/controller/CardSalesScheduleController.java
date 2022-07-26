package com.chenle.springcloud_provider.controller;


import com.chenle.springcloud_provider.mapper_return.CardSalesScheduleMapper;
import com.chenle.springcloudapi.entity_return.CardSalesSchedule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@Slf4j
@RestController
@RequestMapping("/api/CardSalesSchedule")
public class CardSalesScheduleController {

    @Autowired
    CardSalesScheduleMapper cardSalesScheduleMapper;

    @GetMapping("/list")
    public CardSalesSchedule[] getList(String start, String end){

        CardSalesSchedule[] cardSalesSchedules = cardSalesScheduleMapper.getlist(start, end);

        return cardSalesSchedules;
    }
}

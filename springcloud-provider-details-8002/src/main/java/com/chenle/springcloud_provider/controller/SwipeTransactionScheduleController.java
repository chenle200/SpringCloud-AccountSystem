package com.chenle.springcloud_provider.controller;


import com.chenle.springcloud_provider.mapper_return.SwipeTransactionScheduleMapper;
import com.chenle.springcloudapi.entity_return.SwipeTransactionSchedule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@Slf4j
@RestController
@RequestMapping("/api/SwipeTransactionSchedule")
public class SwipeTransactionScheduleController {

    @Autowired
    SwipeTransactionScheduleMapper swipeTransactionScheduleMapper;

    @GetMapping("/list")
    public SwipeTransactionSchedule[] getList(String start, String end){
        SwipeTransactionSchedule[] swipeTransactionSchedules = swipeTransactionScheduleMapper.getlist(start, end);
        return swipeTransactionSchedules;
    }
}

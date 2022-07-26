package com.chenle.springcloud_provider.controller;


import com.chenle.springcloud_provider.mapper_return.ReturnCardScheduleMapper;
import com.chenle.springcloudapi.entity_return.ReturnCardSchedule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@Slf4j
@RestController
@RequestMapping("/api/ReturnCardSchedule")
public class ReturnCardScheduleController {

    @Autowired
    ReturnCardScheduleMapper returnCardScheduleMapper;

    @GetMapping("/list")
    public ReturnCardSchedule[] getList(String start, String end){

        ReturnCardSchedule[] returnCardSchedules = returnCardScheduleMapper.getlist(start, end);

        return returnCardSchedules;

    }
}

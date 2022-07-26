package com.chenle.springcloud_provider.controller;


import com.chenle.springcloud_provider.mapper_return.RevenueSummaryDailyStatementMapper;
import com.chenle.springcloudapi.entity_return.RevenueSummaryDailyStatement;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@Slf4j
@RestController
@RequestMapping("/api/RevenueSummaryDailyStatement")
public class RevenueSummaryDailyStatementController {

    @Autowired
    RevenueSummaryDailyStatementMapper statementMapper;

    @GetMapping("/list")
    public RevenueSummaryDailyStatement[] getList(String start, String end){
        RevenueSummaryDailyStatement[] revenueSummaryDailyStatements = statementMapper.getlist(start, end);
        return revenueSummaryDailyStatements;
    }
}

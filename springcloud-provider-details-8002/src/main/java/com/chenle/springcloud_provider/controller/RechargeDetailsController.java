package com.chenle.springcloud_provider.controller;


import com.chenle.springcloud_provider.mapper_return.RechargeDetailsMapper;
import com.chenle.springcloudapi.entity_return.RechargeDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@Slf4j
@RestController
@RequestMapping("/api/RechargeDetails")
public class RechargeDetailsController {

    @Autowired
    RechargeDetailsMapper rechargeDetailsMapper;

    @GetMapping("/list")
    public RechargeDetails[] getList(String start, String end){
        RechargeDetails[] rechargeDetails = rechargeDetailsMapper.getlist(start, end);
        return rechargeDetails;
    }
}

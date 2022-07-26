package com.chenle.springcloud_provider.controller;


import com.chenle.springcloud_provider.mapper_return.ReconciliationMapper;
import com.chenle.springcloudapi.common.R;
import com.chenle.springcloudapi.entity_return.BOMDailyRevenue;
import com.chenle.springcloudapi.entity_return.OperatorStatistics;
import com.chenle.springcloudapi.entity_return.Reconciliation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@Slf4j
@RestController
@RequestMapping("/api/Reconciliation")
public class ReconciliationController {

    @Autowired
    ReconciliationMapper reconciliationMapper;

    @GetMapping("/list")
    public Reconciliation[] getList(String start, String end){
        Reconciliation[] reconciliations = reconciliationMapper.getlist(start, end);
        int i = 1;
        for (Reconciliation b :
                reconciliations   ) {
            b.setXuhao(i++);
        }
        return reconciliations;
    }
}

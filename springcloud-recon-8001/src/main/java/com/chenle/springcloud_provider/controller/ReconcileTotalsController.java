package com.chenle.springcloud_provider.controller;


import com.chenle.springcloud_provider.mapper_return.ReconcileTotalsMapper;
import com.chenle.springcloudapi.common.R;
import com.chenle.springcloudapi.entity_return.BOMDailyRevenue;
import com.chenle.springcloudapi.entity_return.ReconcileTotals;
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
@RequestMapping("/api/ReconcileTotals")
public class ReconcileTotalsController {

    @Autowired
    ReconcileTotalsMapper reconcileTotalsMapper;

    @GetMapping("/list")
    public ReconcileTotals[] getList(String start, String end){
        ReconcileTotals[] reconcileTotals = reconcileTotalsMapper.getlist(start, end);
        int i = 1;
        for (ReconcileTotals b :
                reconcileTotals   ) {
            b.setXuhao(i++);
        }
        return reconcileTotals;
    }
}

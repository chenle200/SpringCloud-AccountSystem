package com.chenle.springcloud_provider.service_return.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenle.springcloud_provider.mapper_return.BOMDailyRevenueMapper;
import com.chenle.springcloud_provider.service_return.BOMDailyRevenueService;
import com.chenle.springcloudapi.entity_return.BOMDailyRevenue;
import org.springframework.stereotype.Service;

@Service
public class BOMDailyRevenueServiceImpl extends ServiceImpl<BOMDailyRevenueMapper, BOMDailyRevenue> implements BOMDailyRevenueService {
}

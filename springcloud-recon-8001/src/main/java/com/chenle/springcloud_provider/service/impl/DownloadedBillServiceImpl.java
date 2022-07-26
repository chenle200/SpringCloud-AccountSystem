package com.chenle.springcloud_provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenle.springcloud_provider.mapper.DownloadedBillMapper;
import com.chenle.springcloud_provider.service.DownloadedBillService;
import com.chenle.springcloudapi.entity.DownloadedBill;
import org.springframework.stereotype.Service;

@Service
public class DownloadedBillServiceImpl extends ServiceImpl<DownloadedBillMapper, DownloadedBill> implements DownloadedBillService {
}

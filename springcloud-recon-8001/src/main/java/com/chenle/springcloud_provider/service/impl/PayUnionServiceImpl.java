package com.chenle.springcloud_provider.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenle.springcloud_provider.mapper.PayUnionMapper;
import com.chenle.springcloud_provider.service.PayUnionService;
import com.chenle.springcloudapi.entity.PayUnion;
import org.springframework.stereotype.Service;

@Service
public class PayUnionServiceImpl  extends ServiceImpl<PayUnionMapper, PayUnion> implements PayUnionService {
}

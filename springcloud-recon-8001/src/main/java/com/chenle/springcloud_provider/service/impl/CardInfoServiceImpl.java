package com.chenle.springcloud_provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenle.springcloud_provider.mapper.CardInfoMapper;
import com.chenle.springcloud_provider.service.CardInfoService;
import com.chenle.springcloudapi.entity.CardInfo;
import org.springframework.stereotype.Service;

@Service
public class CardInfoServiceImpl extends ServiceImpl<CardInfoMapper, CardInfo> implements CardInfoService {
}

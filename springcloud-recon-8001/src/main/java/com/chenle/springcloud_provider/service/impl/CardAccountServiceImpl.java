package com.chenle.springcloud_provider.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenle.springcloud_provider.mapper.CardAccountMapper;
import com.chenle.springcloudapi.entity.CardAccount;
import com.chenle.springcloud_provider.service.CardAccountService;
import org.springframework.stereotype.Service;

@Service
public class CardAccountServiceImpl extends ServiceImpl<CardAccountMapper, CardAccount> implements CardAccountService {
}

package com.chenle.springcloud_provider.service.impl;



import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenle.springcloud_provider.mapper.TransRecordMapper;
import com.chenle.springcloud_provider.service.TransRecordService;
import com.chenle.springcloudapi.entity.TransRecord;
import org.springframework.stereotype.Service;

@Service
public class TransRecordServiceImpl extends ServiceImpl<TransRecordMapper, TransRecord> implements TransRecordService {
}

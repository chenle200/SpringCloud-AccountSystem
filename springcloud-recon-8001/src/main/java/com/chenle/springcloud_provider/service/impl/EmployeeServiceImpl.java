package com.chenle.springcloud_provider.service.impl;



import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenle.springcloud_provider.mapper.EmployeeMapper;
import com.chenle.springcloud_provider.service.EmployeeService;
import com.chenle.springcloudapi.entity.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}

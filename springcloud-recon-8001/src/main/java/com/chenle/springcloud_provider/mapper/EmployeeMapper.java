package com.chenle.springcloud_provider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chenle.springcloudapi.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

    @Select("select * from employee")
    Employee[] getlist();
    @Select("select * from employee where username=#{username} and password=#{password}")
    Employee login(String username,String password);
}

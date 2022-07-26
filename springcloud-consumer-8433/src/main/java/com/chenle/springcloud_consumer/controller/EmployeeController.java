package com.chenle.springcloud_consumer.controller;


import com.chenle.springcloudapi.entity.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@Slf4j
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
        @Autowired
        private RestTemplate restTemplate;
        private static final String REST_URL_PREFIX = "http://springcloud-reconciliation";


        @GetMapping("/page")
        public Employee[] getList(){
            return restTemplate.getForObject(REST_URL_PREFIX+"/api/page/", new Employee[1].getClass());
    }
        @GetMapping("/login")
        public Employee login(String username,String password){
            return restTemplate.getForObject(REST_URL_PREFIX+"/api/login/?username="+username+"&password="+password,Employee.class);
    }
}
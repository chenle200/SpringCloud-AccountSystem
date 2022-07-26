package com.chenle.springcloud_provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // 在服务启动后自动注册到Eureka中！
@EnableDiscoveryClient // 服务发现
public class DeptProviderdetails_8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProviderdetails_8001.class, args);
    }
}

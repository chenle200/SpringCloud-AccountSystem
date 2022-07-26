package com.chenle.springcloudeureka7001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
// @EnableEurekaServer 服务端的启动类，可以接受别人注册进来~
@EnableEurekaServer
public class SpringcloudEureka7001Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEureka7001Application.class, args);
    }

}

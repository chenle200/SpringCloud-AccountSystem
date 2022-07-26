package com.chenle.springcloud_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Consumer8433Application {

    public static void main(String[] args) {
        SpringApplication.run(Consumer8433Application.class, args);
    }

}

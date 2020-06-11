package com.lin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.lin.mapper")
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumeroneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumeroneApplication.class, args);
    }

}

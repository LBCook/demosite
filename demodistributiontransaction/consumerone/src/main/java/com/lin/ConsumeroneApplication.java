package com.lin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lin.mapper")
@SpringBootApplication
public class ConsumeroneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumeroneApplication.class, args);
    }

}

package com.lin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {


    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return string;
    }

    /*@GetMapping(value = "/echo/{message}")
    public String echo(@RequestParam String message) {
        // TODO
        // 1，需要有一个mysql数据库，使用docker安装
        // 2，通过Mybatis操作
        log.info("log message [" + message + "]");
        return message;
    }*/

}

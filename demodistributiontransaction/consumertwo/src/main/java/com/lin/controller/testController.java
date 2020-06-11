package com.lin.controller;

import com.lin.remote.ConsumerTwoRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @Autowired
    private ConsumerTwoRemote consumerTwoRemote;

    @GetMapping("hello")
    public void testRemote(){
        consumerTwoRemote.echo("hello from two");
    }

}

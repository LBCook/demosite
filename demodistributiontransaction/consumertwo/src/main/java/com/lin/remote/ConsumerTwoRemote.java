package com.lin.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "consumerone")
public interface ConsumerTwoRemote {

    @RequestMapping(value = "/echo")
    public String echo(@RequestParam(value = "message") String message);


}

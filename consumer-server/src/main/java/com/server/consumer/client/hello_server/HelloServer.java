package com.server.consumer.client.hello_server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author dubooooo@126.com 2018-05-31
 */
@RequestMapping("/hello")
public interface HelloServer {

    @RequestMapping("/feignTest")
    public String feignTest(@RequestParam("name") String name);

}

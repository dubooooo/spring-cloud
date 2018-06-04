package com.server.hello.web;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author dubooooo@126.com 2018-05-29
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private HttpServletRequest request;
    @Autowired
    private HttpServletResponse response;

    @RequestMapping("/hystrixTest")
    public String hystrixTest(int sleepTime) throws InterruptedException {
        log.info("sleepTime: {}", sleepTime);
        Thread.sleep(sleepTime);
        return JSON.toJSONString("sleep time: " + sleepTime);
    }

    @RequestMapping("/feignTest")
    public String feignTest(String name) throws InterruptedException {
        String str = "From hello-server-HelloController-feignTest, Parameter: " + name;
        String ip = request.getLocalAddr();
        int port = request.getLocalPort();
        return str + "  ServerInfo: " + ip + ":" + port;
    }

}

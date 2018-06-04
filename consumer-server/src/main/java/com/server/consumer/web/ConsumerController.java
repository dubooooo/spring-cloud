package com.server.consumer.web;

import com.alibaba.fastjson.JSON;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.server.consumer.client.hello_server.HelloServerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

/**
 * @author dubooooo@126.com 2018-05-29
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private HelloServerClient helloServerClient;

    @RequestMapping("/gatewayTest")
    public String gatewayTest() {
        ResponseEntity<String> result = restTemplate.getForEntity("http://gateway-server/hello-server/hello/hystrixTest?sleepTime=1", String.class);
        return JSON.toJSONString(result);
    }

    @RequestMapping("/hystrixTest")
    @HystrixCommand(fallbackMethod = "fallbackMethod")
    public String hystrixTest() {
        Random random = new Random();
        int sleepTime = random.nextInt(10000);
        ResponseEntity<String> result = restTemplate.getForEntity("http://gateway-server/hello-server/hello/hystrixTest?sleepTime=" + sleepTime, String.class);
        return JSON.toJSONString(result);
    }

    @RequestMapping("/feignClientTest")
    public String feignClientTest() {
        return helloServerClient.feignTest("dubooo");
    }

    public String fallbackMethod(Throwable e) {
        return "Throwable: " + e;
    }

}

package com.server.hello.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dubooooo@126.com 2018-05-29
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "hello-server";
    }

}

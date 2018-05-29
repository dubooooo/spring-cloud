package com.server.hello.configuration;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

/**
 * @author dubooooo@126.com 2018-05-28
 */
@Configuration
@EnableDiscoveryClient
public class SpringBootConfig {

    public SpringBootConfig() {
        System.out.println(getClass().getName() + " start...");
    }
}

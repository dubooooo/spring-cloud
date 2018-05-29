package com.server.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

/**
 * @author dubooooo@126.com 2018-05-28
 */
@Configuration
@EnableDiscoveryClient
@EnableAdminServer
public class SpringBootConfig {

    public SpringBootConfig() {
        System.out.println(getClass().getName() + " start...");
    }
}

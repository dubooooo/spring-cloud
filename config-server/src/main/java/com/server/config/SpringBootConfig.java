package com.server.config;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

/**
 * @author dubooooo@126.com 2018-05-28
 */
@Configuration
@EnableConfigServer
@EnableDiscoveryClient
public class SpringBootConfig {

}

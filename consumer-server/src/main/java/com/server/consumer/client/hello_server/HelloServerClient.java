package com.server.consumer.client.hello_server;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author dubooooo@126.com 2018-05-31
 */
@FeignClient("hello-server")
public interface HelloServerClient extends HelloServer {

}

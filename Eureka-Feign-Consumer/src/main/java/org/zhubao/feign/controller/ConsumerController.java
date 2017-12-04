package org.zhubao.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zhubao.feign.client.HelloClient;

@RestController
public class ConsumerController {

    @Autowired
    private HelloClient helloClient;
    
    @GetMapping("/consumer/feign")
    public String callEurekaClient() {
        return helloClient.callEurekaClient();
    }
}

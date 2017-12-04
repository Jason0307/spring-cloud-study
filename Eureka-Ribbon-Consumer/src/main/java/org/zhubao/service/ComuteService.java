package org.zhubao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ComuteService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String callEurekaService() {
        return restTemplate.getForEntity("http://EUREKA-CLIENT/client", String.class).getBody();
    }

    public String addServiceFallback() {
        return "error";
    }
}

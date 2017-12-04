package org.zhubao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.serviceregistry.EurekaRegistration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zhubao.dto.BirdDTO;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class AppController {
    
    @Autowired
    private EurekaRegistration registration;
    
    @GetMapping("/client")
    public BirdDTO getBird() {
        String instance = registration.getServiceId();
        log.info("/client, port:" + registration.getNonSecurePort() + ", service_id:" + instance);
        return new BirdDTO("Woodpecker");
    }
}

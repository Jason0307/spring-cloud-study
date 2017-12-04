package org.zhubao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zhubao.service.ComuteService;

@RestController
public class RibbonController {

    @Autowired
    private ComuteService comuteService;
    
    @GetMapping("/consumer/ribbon")
    public String callEurekaClient() {
        return comuteService.callEurekaService();
    }
}

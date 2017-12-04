package org.zhubao.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zhubao.dto.AppDTO;

@RestController
@RefreshScope
public class HelloController {

    @Value("${app.name}")
    private String appName;
    
    @GetMapping
    public AppDTO getAppName() {
        return new AppDTO(appName);
    }
}

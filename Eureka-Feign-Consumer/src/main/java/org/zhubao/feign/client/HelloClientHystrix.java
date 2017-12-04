package org.zhubao.feign.client;

import org.springframework.stereotype.Component;

@Component
public class HelloClientHystrix implements HelloClient {

    @Override
    public String callEurekaClient() {
        return "Server is down";
    }

}

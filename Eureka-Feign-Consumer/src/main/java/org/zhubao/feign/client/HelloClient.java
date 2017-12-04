package org.zhubao.feign.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-client", fallback = HelloClientHystrix.class)
public interface HelloClient {

    @GetMapping("/client")
    String callEurekaClient();
}

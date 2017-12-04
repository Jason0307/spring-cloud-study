package org.zhubao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaConfigClientApplicationAppOne {

	public static void main(String[] args) {
		SpringApplication.run(EurekaConfigClientApplicationAppOne.class, args);
	}
}

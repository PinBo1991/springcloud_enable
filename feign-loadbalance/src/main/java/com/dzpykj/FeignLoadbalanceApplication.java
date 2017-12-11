package com.dzpykj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignLoadbalanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignLoadbalanceApplication.class, args);
	}
}

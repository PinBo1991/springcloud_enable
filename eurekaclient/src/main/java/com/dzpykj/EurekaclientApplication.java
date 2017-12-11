package com.dzpykj;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableEurekaClient
@RestController
@SpringBootApplication
public class EurekaclientApplication {

	@Value("${spring.application.name}")
	String springAppName;
	
	@Value("${server.port}")
	String serverPort;
	
    @RequestMapping("/")
    public String home() {
        return "Hello! 您正在访问主机:"+springAppName+"; 端口号为:"+serverPort;
    }
    
    @RequestMapping("/hi")
    public String hi(String name) {
    	return "hi!"+name+" 您正在访问主机:"+springAppName+"; 端口号为:"+serverPort;
    }

	public static void main(String[] args) {
		SpringApplication.run(EurekaclientApplication.class, args);
	}
}

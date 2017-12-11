package com.dzpykj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class SleuthZipkinYangApplication {

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @RequestMapping("/hi")
    public String callHome(){
    	System.out.println("calling trace sleuth_zipkin-yang");
        return restTemplate.getForObject("http://localhost:8988/xiao", String.class);
    }
    
    @RequestMapping("/yang")
    public String info(){
        System.out.println("calling trace sleuth_zipkin-yang");
        return "i'm sleuth_zipkin-yang";
    }
    
    @Bean
    public AlwaysSampler defaultSampler(){
        return new AlwaysSampler();
    }
	
	public static void main(String[] args) {
		SpringApplication.run(SleuthZipkinYangApplication.class, args);
	}
}

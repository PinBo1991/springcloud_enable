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
public class SleuthZipkinXiaoApplication {

	    @Autowired
	    private RestTemplate restTemplate;

	    @Bean
	    public RestTemplate getRestTemplate(){
	        return new RestTemplate();
	    }

	    @RequestMapping("/hi")
	    public String callHome(){
	    	System.out.println("calling trace sleuth_zipkin-xiao");
	        return restTemplate.getForObject("http://localhost:8989/yang", String.class);
	    }
	    
	    @RequestMapping("/xiao")
	    public String info(){
	        System.out.println("calling trace sleuth_zipkin-xiao");
	        return "i'm sleuth_zipkin-xiao";
	    }
	    
	    @Bean
	    public AlwaysSampler defaultSampler(){
	        return new AlwaysSampler();
	    }
	
	public static void main(String[] args) {
		SpringApplication.run(SleuthZipkinXiaoApplication.class, args);
	}
}

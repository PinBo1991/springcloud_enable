package com.dzpykj.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dzpykj.fallback.HiServiceFallback;

@FeignClient(value = "eurekaclient",fallback = HiServiceFallback.class)
public interface HiService {
	
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	String sayHi(@RequestParam(value = "name") String name);
	
}

package com.dzpykj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dzpykj.service.HiService;

@RestController
public class SayHiController {

	@Autowired
	HiService hiService;
	
	@RequestMapping("/hi")
	public String sayHi(@RequestParam String name) {
		return hiService.sayHi(name)+"-->From Feign";
	}
	

}

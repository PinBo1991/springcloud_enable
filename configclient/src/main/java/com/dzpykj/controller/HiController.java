package com.dzpykj.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
	
	@Value("${testkey}")
    String testkey;
	
    @RequestMapping(value = "/hi")
    public String hi(){
        return testkey;
    }

	
}

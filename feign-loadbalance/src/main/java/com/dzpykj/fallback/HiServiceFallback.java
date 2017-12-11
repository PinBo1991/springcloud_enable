package com.dzpykj.fallback;

import org.springframework.stereotype.Component;

import com.dzpykj.service.HiService;

@Component
public class HiServiceFallback implements HiService {

	@Override
	public String sayHi(String name) {
		return "hi!"+name+" 您访问遇到错误了 ---From Feign";
	}
}

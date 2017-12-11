package com.dzpykj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class SleuthZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SleuthZipkinServerApplication.class, args);
	}
}

package com.psbc.stgermain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableHystrix
@EnableFeignClients
@SpringBootApplication
public class StGermainApplication {

	public static void main(String[] args) {
		SpringApplication.run(StGermainApplication.class, args);
	}

}

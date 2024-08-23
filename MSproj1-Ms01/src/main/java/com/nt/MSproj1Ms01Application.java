package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class MSproj1Ms01Application {

	public static void main(String[] args) {
		SpringApplication.run(MSproj1Ms01Application.class, args);
	}

}

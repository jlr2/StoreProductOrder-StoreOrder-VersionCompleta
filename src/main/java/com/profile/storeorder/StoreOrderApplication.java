package com.profile.storeorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StoreOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreOrderApplication.class, args);
	}

}

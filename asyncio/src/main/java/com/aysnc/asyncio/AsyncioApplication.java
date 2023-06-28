package com.aysnc.asyncio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAsync
public class AsyncioApplication {

	public static void main(String[] args) {
		//code
		SpringApplication.run(AsyncioApplication.class, args);
	}

}

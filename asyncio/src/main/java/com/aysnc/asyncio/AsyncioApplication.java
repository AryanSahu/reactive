package com.aysnc.asyncio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAsync
public class AsyncioApplication {

	// this file will be reviewed as part of the demo
	public static void main(String[] args) {
		SpringApplication.run(AsyncioApplication.class, args);
	}

}

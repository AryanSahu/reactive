package com.aysnc.asyncio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAsync
public class AsyncioApplication {

	// this file will be reviewed as part of the demo
	int[] numbers = {1, 2, 3};
        System.out.println(numbers[4]);
	
	public static void main(String[] args) {
		SpringApplication.run(AsyncioApplication.class, args);
	}

}

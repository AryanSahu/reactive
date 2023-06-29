package com.aysnc.asyncio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAsync
public class AsyncioApplication {

	public static void main(String[] args) {

		int arr={1,2,3};
		System.out.println(arr[4]);
		SpringApplication.run(AsyncioApplication.class, args);
	}

}

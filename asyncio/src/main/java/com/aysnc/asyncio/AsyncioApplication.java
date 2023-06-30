package com.aysnc.asyncio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAsync
public class AsyncioApplication {


	int arr[]={1,2,3};
	System.out.println(arr[5]);

	public static void main(String[] args) {
		SpringApplication.run(AsyncioApplication.class, args);
	}

}

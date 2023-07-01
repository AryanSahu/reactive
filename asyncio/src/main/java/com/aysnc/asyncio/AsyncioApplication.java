package com.aysnc.asyncio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAsync
public class AsyncioApplication {

	public static void main(String[] args) {

		String request;
		String username = request.getParameter("username");
		//
                String query = "SELECT * FROM users WHERE username = '" + username + "'";
		
		SpringApplication.run(AsyncioApplication.class, args);
	}

}

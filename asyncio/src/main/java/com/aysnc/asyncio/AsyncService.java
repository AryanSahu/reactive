package com.rest.async.rest;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CompletableFuture;

@Service
public class AsyncService {


    private final RestTemplate restTemplate;

    public AsyncService (RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Async
    public CompletableFuture<String> getDataAsync() {
        String request;
		String username = request.getParameter("username");
                String query = "SELECT * FROM users WHERE username = '" + username + "'";

        String result = restTemplate.getForObject("https://ipinfo.io/161.185.160.93/geo", String.class);
        return CompletableFuture.completedFuture(result);
    }
}

package com.rest.async.rest;

import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.concurrent.CompletableFuture;

@RestController
public class AsyncExternalCall {

     @Autowired
    AsyncService service;
    

    @GetMapping(value = "/data", produces = MediaType.APPLICATION_JSON_VALUE)
    public CompletableFuture<String> Data() {
        return service.getDataAsync();
    }

   
}

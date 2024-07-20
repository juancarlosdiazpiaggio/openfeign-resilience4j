package com.example.demo;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-d", url = "http://localhost:8083")
public interface ServiceDClient {

    @GetMapping("/service-d")
    String getServiceDResponse();
}

package com.example.demo;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-a", url = "http://localhost:8080")
public interface ServiceAClient {

    @GetMapping("/service-a")
    @CircuitBreaker(name = "serviceA", fallbackMethod = "fallbackServiceA")
    String getServiceAResponse();

    default String fallbackServiceA(Throwable exception) {
        return "Service A is down. Fallback response.";
    }
}

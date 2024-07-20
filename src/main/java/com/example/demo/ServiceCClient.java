package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-c", url = "http://localhost:8082")
public interface ServiceCClient {
    @GetMapping("/service-c")
    String getServiceCResponse();
}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RestController
    @RequestMapping("/api")
    public static class ApiController {

        private final ApiService apiService;

        public ApiController(ApiService apiService) {
            this.apiService = apiService;
        }

        @GetMapping("/service-a")
        public String callServiceA() {
            return apiService.callServiceA();
        }

        @GetMapping("/service-b")
        public String callServiceB() {
            return apiService.callServiceB();
        }

        @GetMapping("/service-c")
        public String callServiceC() {
            return apiService.callServiceC();
        }

        @GetMapping("/service-d")
        public String callServiceD() {
            return apiService.callServiceD();
        }
    }
}

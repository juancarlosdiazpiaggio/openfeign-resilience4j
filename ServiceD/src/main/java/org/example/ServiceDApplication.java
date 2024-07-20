package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ServiceDApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDApplication.class, args);
    }
}

@RestController
class ServiceDController {

    @GetMapping("/service-d")
    public String serviceD() {
        return "Hello from Service D!";
    }
}

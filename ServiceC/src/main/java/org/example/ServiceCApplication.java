package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ServiceCApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCApplication.class, args);
    }
}

@RestController
class ServiceCController {

    @GetMapping("/service-c")
    public String serviceC() {
        return "Hello from Service C!";
    }
}

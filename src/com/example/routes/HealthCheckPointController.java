package com.example.routes;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HealthCheckPointController {
    private static final String response = "Reached the health checkpoint\n";

    @GetMapping("/health")
    public String getHealthResponse(){
        return response;
    }

}

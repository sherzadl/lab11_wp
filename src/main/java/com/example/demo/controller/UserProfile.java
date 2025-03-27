package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/user-profile")
    public Map<String, Object> getUserProfile() {
        Map<String, Object> response = new HashMap<>();
        response.put("name", "John Doe");
        response.put("email", "john.doe@example.com");
        response.put("role", "Admin");
        return response;
    }
}

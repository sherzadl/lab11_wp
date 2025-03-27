package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class CourseController {

    @GetMapping("/course-info")
    public Map<String, Object> getCourseInfo() {
        Map<String, Object> response = new HashMap<>();
        response.put("title", "Java Programming");
        response.put("description", "An advanced Java programming course");
        response.put("duration", "3 months");
        return response;
    }
}

package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/student")
public class StudentController {

    private String name = "Ali";
    private int age = 21;

    @GetMapping("")
    public String getStudent() {
        return "Student: " + name + ", Age: " + age;
    }

    @GetMapping("/is-adult/{age}")
    public String isAdult(@PathVariable int age) {
        return age >= 18 ? "Age " + age + ": You are an adult."
                : "Age " + age + ": You are not an adult.";
    }

    @PutMapping("/update-student/{age}")
    public String updateStudent(@PathVariable int age) {
        this.age = age;
        return "Updated student age to: " + age;
    }

    @GetMapping("/student-info")
    public Map<String, Object> getStudentInfo() {
        Map<String, Object> response = new HashMap<>();
        response.put("name", "Ali");
        response.put("age", 21);
        response.put("status", "active");
        return response;
    }
}

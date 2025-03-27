package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {
    private String title = "Web Programming";
    private int duration = 2; // in hours

    @GetMapping("")
    public String getCourse() {
        return "Course: " + title + ", Duration: " + duration + " hours";
    }
}

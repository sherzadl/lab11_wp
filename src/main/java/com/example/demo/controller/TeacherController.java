package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    private String name = "Mr. Timur";
    private String subject = "Math";

    @GetMapping("")
    public String getTeacher() {
        return "Teacher: " + name + ", Subject: " + subject;
    }
}

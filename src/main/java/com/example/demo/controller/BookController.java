package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
    private String title = "CS2 movement";
    private String author = "Ali";
    private double price = 15;

    @GetMapping("")
    public String getBook() {
        return "Book: " + title + ", Author: " + author + ", Price: $" + price;
    }
}

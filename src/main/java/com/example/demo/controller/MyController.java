package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MyController {

    @GetMapping("/home")
    public String home() {
        return "Welcome to Home Page!";
    }

    @GetMapping("/services")
    public String services() {
        return "<h2>Our Services</h2>"
                + "<ul>"
                + "<li>Web Development</li>"
                + "<li>Mobile App Development</li>"
                + "<li>SEO Optimization</li>"
                + "</ul>";
    }

    @GetMapping("/about")
    public String about() {
        return "This is our application. It provides various web services.";
    }

    @GetMapping("/faq")
    public String faq() {
        return "<h2>Frequently Asked Questions</h2>"
                + "<p>1. What services do you offer?</p>"
                + "<p>2. How can I contact support?</p>";
    }

    @GetMapping("/contact-us")
    public String contact() {
        return "Contact us at: contact@example.com";
    }

    @GetMapping("/team")
    public String team() {
        return "<h2>Meet Our Team</h2>"
                + "<p>1. John Doe - CEO</p>"
                + "<p>2. Jane Smith - CTO</p>";
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/square/{num}")
    public String square(@PathVariable int num) {
        return "The square of " + num + " is " + (num * num) + ".";
    }

    @GetMapping("/double/{num}")
    public String doubleNumber(@PathVariable int num) {
        return "Double of " + num + " is " + (num * 2) + ".";
    }

    @GetMapping("/length/{text}")
    public String stringLength(@PathVariable String text) {
        return "The length of '" + text + "' is " + text.length() + ".";
    }

    @GetMapping("/reverse/{text}")
    public String reverseString(@PathVariable String text) {
        return "Reversed: " + new StringBuilder(text).reverse().toString();
    }

    @GetMapping("/concat/{str1}/{str2}")
    public String concatenate(@PathVariable String str1, @PathVariable String str2) {
        return "Concatenated: " + str1 + str2;
    }

    @GetMapping("/add/{x}/{y}")
    public String add(@PathVariable int x, @PathVariable int y) {
        return "The sum of " + x + " and " + y + " is " + (x + y) + ".";
    }

    @GetMapping("/multiply/{x}/{y}")
    public String multiply(@PathVariable int x, @PathVariable int y) {
        return "The product of " + x + " and " + y + " is " + (x * y) + ".";
    }

    @GetMapping("/subtract/{x}/{y}")
    public String subtract(@PathVariable int x, @PathVariable int y) {
        return "The difference between " + x + " and " + y + " is " + (x - y) + ".";
    }

    @GetMapping("/divide/{x}/{y}")
    public String divide(@PathVariable int x, @PathVariable int y) {
        if (y == 0) {
            return "Error: Division by zero is not allowed.";
        }
        return "The result of " + x + " divided by " + y + " is " + (x / (double) y) + ".";
    }

    @GetMapping("/modulus/{x}/{y}")
    public String modulus(@PathVariable int x, @PathVariable int y) {
        if (y == 0) {
            return "Error: Modulus by zero is not allowed.";
        }
        return "The remainder when " + x + " is divided by " + y + " is " + (x % y) + ".";
    }

    @GetMapping("/power/{base}/{exp}")
    public String power(@PathVariable int base, @PathVariable int exp) {
        return base + " raised to the power of " + exp + " is " + Math.pow(base, exp) + ".";
    }

}

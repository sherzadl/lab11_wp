package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class QueryController {

    @GetMapping("/greet")
    public String greet(@RequestParam(name = "name", defaultValue = "Guest") String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/calculate")
    public String calculate(
            @RequestParam double x,
            @RequestParam double y,
            @RequestParam String operation) {

        double result;
        switch (operation.toLowerCase()) {
            case "add":
                result = x+y;
                break;
            case "subtract":
                result =x-y;
                break;
            case "multiply":
                result =x*y;
                break;
            case "divide":
                if (y==0) return "Cannot divide by zero!";
                result = x/y;
                break;
            default:
                return "Invalid operation. Use add, subtract, multiply, or divide.";
        }
        return "Result: " + result;
    }

    @GetMapping("/filter")
    public String filter(
            @RequestParam String keyword,
            @RequestParam String category) {
        return "Filtering results for keyword: '" + keyword + "' in category: '" + category + "'.";
    }

    @GetMapping("/convert")
    public String convertTemperature(@RequestParam double temperature) {
        double fahrenheit = (temperature * 9 / 5) + 32;
        return temperature + "°C is equal to " + fahrenheit + "°F.";
    }

    @GetMapping("/discount")
    public String calculateDiscount(
            @RequestParam double originalPrice,
            @RequestParam double discountRate) {

        if (discountRate < 0 || discountRate > 100) {
            return "Invalid discount rate. Please enter a value between 0 and 100.";
        }

        double discount = (originalPrice * discountRate) / 100;
        double finalPrice = originalPrice - discount;

        return "Original Price: $" + originalPrice + ", Discount: $" + discount + ", Final Price: $" + finalPrice;
    }
}

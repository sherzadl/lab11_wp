package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ProductController {

    @GetMapping("/product-details")
    public Map<String, Object> getProductDetails() {
        Map<String, Object> response = new HashMap<>();
        response.put("name", "Laptop");
        response.put("category", "Electronics");
        response.put("price", 1200.50);
        response.put("stock_status", "In Stock");
        return response;
    }
}

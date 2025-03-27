package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class OrderController {

    @GetMapping("/order-summary")
    public Map<String, Object> getOrderSummary() {
        Map<String, Object> response = new HashMap<>();
        response.put("order_id", 101);
        response.put("customer_name", "Alice Johnson");
        response.put("items", "Laptop, Mouse");
        response.put("total_cost", 1300.75);
        return response;
    }
}

package com.ust.LaptopRecommender.controller;

import com.ust.LaptopRecommender.model.Laptop;
import com.ust.LaptopRecommender.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/laptops")
public class LaptopController {

    @Autowired
    private LaptopService laptopService;

    @GetMapping
    public List<Laptop> recommendLaptops(@RequestParam Double budget, @RequestParam String brand) {
        return laptopService.recommendLaptops(budget, brand);
    }
}
package com.ust.LaptopRecommender.controller;

import com.ust.LaptopRecommender.model.Laptop;
import com.ust.LaptopRecommender.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class LaptopController {

    @Autowired
    private LaptopService laptopService;

    @GetMapping("/Find Laptops")
    public List<Laptop> recommendLaptops(@RequestParam double budget, @RequestParam String brand) {
        return laptopService.recommendLaptops(budget, brand);
    }

    @PostMapping("/Add Laptops")
    public Laptop saveLaptop(@RequestBody Laptop laptop) {
        laptopService.saveLaptop(laptop);
        return laptop;
    }
}
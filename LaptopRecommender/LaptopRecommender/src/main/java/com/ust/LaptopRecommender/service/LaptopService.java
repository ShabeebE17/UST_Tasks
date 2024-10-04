package com.ust.LaptopRecommender.service;

import com.ust.LaptopRecommender.model.Laptop;
import com.ust.LaptopRecommender.repo.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository laptopRepository;

    public List<Laptop> recommendLaptops(Double budget, String brand) {
        return laptopRepository.findLaptopsByBudgetAndModel(budget, brand);
    }
}
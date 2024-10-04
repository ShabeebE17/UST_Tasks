package com.ust.LaptopRecommender.service;

import com.speedment.jpastreamer.application.JPAStreamer;
import com.ust.LaptopRecommender.model.Laptop;
import com.ust.LaptopRecommender.repo.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository laptopRepository;
    @Autowired
    private JPAStreamer jpaStreamer;

    public List<Laptop> recommendLaptops(double budget, String brand) {
        return jpaStreamer.stream(Laptop.class)
                .filter(laptop -> laptop.getBudget() <= budget)
                .filter(laptop -> laptop.getBrand().equalsIgnoreCase(brand))
                .toList();
    }

    public Laptop saveLaptop(Laptop laptop) {
        return laptopRepository.save(laptop);
    }
}
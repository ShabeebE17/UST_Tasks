package com.ust.LaptopRecommender.repo;

import com.ust.LaptopRecommender.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LaptopRepository extends JpaRepository<Laptop, Long>, JpaSpecificationExecutor<Laptop> {
    @Query("SELECT l FROM Laptop l WHERE l.budget <= :budget AND l.brand LIKE %:brand%")
    List<Laptop> findLaptopsByBudgetAndModel(Double budget, String brand);
}
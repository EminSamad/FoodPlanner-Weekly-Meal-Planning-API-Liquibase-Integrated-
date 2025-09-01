package com.example.devlabtask2.repository;

import com.example.devlabtask2.model.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealRepository extends JpaRepository<Meal, Long> {
}
package com.example.devlabtask2.controller;

import com.example.devlabtask2.domain.MealPlan;
import com.example.devlabtask2.repository.MealPlanRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/meal-plans")
public class MealPlanController {

    private final MealPlanRepository mealPlanRepository;

    public MealPlanController(MealPlanRepository mealPlanRepository) {
        this.mealPlanRepository = mealPlanRepository;
    }

    @GetMapping
    public List<MealPlan> getAllMealPlans() {
        return mealPlanRepository.findAll();
    }

    @PostMapping
    public MealPlan createMealPlan(@RequestBody MealPlan mealPlan) {
        return mealPlanRepository.save(mealPlan);
    }
}

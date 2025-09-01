package com.example.devlabtask2.service;

import com.example.devlabtask2.model.Meal;
import com.example.devlabtask2.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealService {

    @Autowired
    private MealRepository mealRepository;

    public List<Meal> getAllMeals() {
        return mealRepository.findAll();
    }

    public Meal saveMeal(Meal meal) {
        return mealRepository.save(meal);
    }
}
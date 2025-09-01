package com.example.devlabtask2.repository;

import com.example.devlabtask2.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
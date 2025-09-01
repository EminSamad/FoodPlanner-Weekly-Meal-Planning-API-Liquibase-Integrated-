package com.example.devlabtask2.repository;

import com.example.devlabtask2.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
package com.example.devlabtask2.repository;

import com.example.devlabtask2.domain.MealPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MealPlanRepository extends JpaRepository<MealPlan, Long> {
}

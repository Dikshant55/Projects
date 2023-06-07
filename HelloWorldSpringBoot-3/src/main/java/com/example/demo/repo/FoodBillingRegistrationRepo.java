package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.repo.entity.FoodBillingRegistration;

@Repository
public interface FoodBillingRegistrationRepo extends JpaRepository<FoodBillingRegistration, Integer>{

}

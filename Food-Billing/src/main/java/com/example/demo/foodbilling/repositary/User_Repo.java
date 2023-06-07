package com.example.demo.foodbilling.repositary;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.foodbilling.entity.User;

@Repository
public interface User_Repo extends JpaRepository<User, Integer>{

}

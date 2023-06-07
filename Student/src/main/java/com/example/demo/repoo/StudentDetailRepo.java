package com.example.demo.repoo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.repo.entity.StudentDetail;

public interface StudentDetailRepo extends JpaRepository<StudentDetail, Integer>{

}

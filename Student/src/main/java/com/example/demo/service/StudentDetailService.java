package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.entity.StudentDetail;
import com.example.demo.repoo.StudentDetailRepo;

@Service
public class StudentDetailService {
	
	@Autowired
	StudentDetailRepo studentDetailRepo;
	
	public StudentDetail getUserData(Integer UserId) {
		
		return studentDetailRepo.getById(UserId);
	}

}

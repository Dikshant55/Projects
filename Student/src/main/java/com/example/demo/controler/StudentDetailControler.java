
package com.example.demo.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repo.entity.StudentDetail;
import com.example.demo.service.StudentDetailService;

@RestController
public class StudentDetailControler {
	
	@Autowired
	StudentDetailService studentdetailserice;
	
	@GetMapping("UserId")
	public StudentDetail getStudentDetailedUSerDetail() {
		
		Integer UserId=300;
		
		//StudentDetail studentdetail = studentdetail.getUserData(UserId);
		//System.out.println(studentdetail);
		return studentdetailserice.getUserData(UserId);
		
	}
	

}

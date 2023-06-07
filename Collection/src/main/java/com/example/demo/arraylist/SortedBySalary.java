package com.example.demo.arraylist;

import java.util.Comparator;

public class SortedBySalary implements Comparator<Teacher> {


		 
	    // Method
	    // Sorting in ascending order of roll number
	    public int compare(Teacher a, Teacher b)
	    {
	 
	        return (int) (a.salary - b.salary);
	   }
	
	

}

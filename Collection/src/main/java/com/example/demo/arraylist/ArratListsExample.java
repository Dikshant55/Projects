package com.example.demo.arraylist;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArratListsExample {
	
	
	public static void main(String[] ars) {
		
		
	
	
	ArrayList<Teacher> teacherlist=new ArrayList<Teacher>();
	
	Teacher teacher=new Teacher("Dikshant",1000.20f,3);
	
	teacherlist.add(teacher);
	
	teacher=new Teacher("Preet",4000,59);
	teacherlist.add(teacher);
	teacher=new Teacher("Amit",900.45f,123);
	teacherlist.add(teacher);
	teacher=new Teacher("Naman",500.56f,24);
	teacherlist.add(teacher);
	teacher=new Teacher("Rohit",12000,150);
	teacherlist.add(teacher);
	teacherlist.add(teacher);
//for (Teacher t:teacherlist ) {
//		
//		System.out.println(t);
//	}
//System.out.println("....");
	
	
	
//	Collections.sort(teacherlist);
//		for (Teacher t:teacherlist ) {
//			System.out.println(t);
//	}
	
Collections.sort(teacherlist, new SortedByName());

System.out.println("\nSorted by name");
for (int i = 0; i < teacherlist.size(); i++)
    System.out.println(teacherlist.get(i));

	}}


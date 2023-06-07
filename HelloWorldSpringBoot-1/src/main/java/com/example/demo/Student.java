package com.example.demo;

public class Student {

	private String name;
	
	private String lastname;
	
	private int rollno;
	
	private int phn1;
	
	private int phn2;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getPhn1() {
		return phn1;
	}

	public void setPhn1(int phn1) {
		this.phn1 = phn1;
	}

	public int getPhn2() {
		return phn2;
	}

	public void setPhn2(int phn2) {
		this.phn2 = phn2;
	}

	public Student(String name, String lastname, int rollno, int phn1, int phn2) {
		this(name, rollno, phn1);
		System.out.println("Called three args constructor");
		
		this.name = name;
		this.lastname = lastname;
		this.rollno = rollno;
		this.phn1 = phn1;
		this.phn2 = phn2;
		System.out.println("End Called 5 args constructor");
	}
	
	
	public Student(String name, int rollno, int phn1) {
		this();
		System.out.println("Called zero args constructor");
		this.name = name;
		this.rollno = rollno;
		this.phn1 = phn1;
	}
	
	public Student() {
		super();
	}
	
	
	
	
	
	
	
}

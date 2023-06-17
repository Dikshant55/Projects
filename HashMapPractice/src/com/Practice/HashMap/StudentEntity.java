package com.Practice.HashMap;

public class StudentEntity {
	
	String name;
	public StudentEntity(String name, String eMail, int age) {
		super();
		this.name = name;
		this.eMail = eMail;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	String eMail;
	int age;
	@Override
	public String toString() {
		return "StudentEntity [name=" + name + ", eMail=" + eMail + ", age=" + age + "]";
	}

}

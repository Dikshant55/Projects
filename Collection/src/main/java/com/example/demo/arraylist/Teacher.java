package com.example.demo.arraylist;

public class Teacher {
	
	
	String name;
	
   public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	//public int compareTo(Teacher comparestu) {
		// float compareage=((Teacher)comparestu).getSalary();
		 //float result=this.salary-compareage;
		 //return (int) result;
		//}
	
	//public int compareTo(Teacher o) {
	  //  return this.name.compareTo(o.getName());
	//}


	@Override
	public String toString() {
		return "Teacher [name=" + name + ", salary=" + salary + ", id=" + id + "]";
	}

	public Teacher(String name, float salary, int id) {
		super();
		this.name = name;
		this.salary = salary;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

float salary;
 
    private int id;

	public Teacher[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
    
	
	

}

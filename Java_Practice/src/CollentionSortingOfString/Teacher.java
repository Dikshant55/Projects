package CollentionSortingOfString;

public class Teacher {
	
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public Teacher(String name, String salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	String salary;
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", salary=" + salary + "]";
	}
	

}

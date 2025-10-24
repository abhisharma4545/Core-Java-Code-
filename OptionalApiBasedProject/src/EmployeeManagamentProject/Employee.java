package EmployeeManagamentProject;


public class Employee {
	private final String name;
	private final String deparment;
	private final String email;
	public Employee(String name, String deparment, String emial) {
		this.name = name;
		this.deparment = deparment;
		this.email = emial;
	}
	public String getName() {
		return name;
	}
	public String getDeparment() {
		return deparment;
	}
	public String getEmail() {
		return email;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", deparment=" + deparment + ", emial=" + email + "]";
	}
	
	
	
	
	

}

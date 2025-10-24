package com.java8.OptionalExample;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
   
class Employee{
	private int id;
	private String name;
	 
	
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public  String getName() {
		return name;

	}
}

public class Jtc {
	
    public static void main(String[] args) {
    	
		List<Employee> employees = Arrays.asList(new Employee(1, "Alok"),new Employee(2,"Babita"),new Employee(3,"charu"));
		
		int searchId = 2;
		Optional<Employee> employee = employees.stream().filter(emp->emp.getId()== searchId).findFirst();
	
				
		String result =employee.map(Employee::getName).orElse("no Employee found");
		System.out.println("Result:"+result);
		
//	for	non found id
		int searchId2 =5;
		employee =employees.stream().filter(emp->emp.getId()==searchId2).findFirst();
		
		result =employee.map(Employee::getName).orElse("no Employee found");
		System.out.println("Result:"+result);
		
	}
}

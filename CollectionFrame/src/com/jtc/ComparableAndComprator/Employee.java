package com.jtc.ComparableAndComprator;
import java.lang.Comparable;

public class  Employee implements Comparable<Employee> {
	int id ;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	// Natural order :sort by Id
	  public int compareTo(Employee e) {
		  return this.id - e.id;
	  }
	public String toString () {
		return id + " - "+ name+ " - "+ salary;
	}
   
}

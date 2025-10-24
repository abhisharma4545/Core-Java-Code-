package com.jtc.ComparableAndComprator;
import java.util.Comparator;
import java.util.*;

 class SalaryCompratorv implements Comparator<Employee> {
	 public int compare(Employee a, Employee b) {
	        return Double.compare(a.salary, b.salary);
	    }

}

class NameComparator implements Comparator<Employee> {
    public int compare(Employee a, Employee b) {
        return a.name.compareTo(b.name);
    }
}
  
public  class Main{
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(103,"John",50000));
		list.add(new Employee(101, "Alice", 60000));
		list.add(new Employee(102, "Bob", 55000));
		
		System.out.println("Sorted by Id (natural)");
		Collections.sort(list);
		for(Employee e:list) {
			System.out.println(e);
		}
		
		System.out.println("\n Sorted By Salary");
		Collections.sort(list,new SalaryCompratorv());
		for(Employee e:list) {
			System.out.println(e);
		}
		System.out.println("\n Sorted by Name");
		Collections.sort(list,new  NameComparator());
		for(Employee e:list) {
			System.out.println(e);
		}
		
	}
	
}
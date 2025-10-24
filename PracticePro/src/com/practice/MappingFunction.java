package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Use of mapping fucntion with another collectors
class Person1 {
	
	String name;
	String city;
	
	public Person1(String name, String city) {
	//	super();
		this.name = name;
		this.city = city;
	}
	
}
public class MappingFunction {
	
	public static void main(String[] args) {
		
		List<Person1> people = Arrays.asList(new Person1("Alice", "Delhi"),
			    new Person1("Bob", "Mumbai"),
			    new Person1("Charlie", "Delhi"));
		
		
//		   Group Names by City
		 Map<String,List<String>> names =  people.stream().collect(Collectors.groupingBy(p->p.city,Collectors.mapping(p->p.name,Collectors.toList())));
		   System.out.println(names);
		
	}
    
}

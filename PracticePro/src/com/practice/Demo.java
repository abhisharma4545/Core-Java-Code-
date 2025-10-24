package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Person{
	
	String sname;
	int sid;
	char grade;
	
	public Person(String sname, int sid, char grade) {
		//super();
		this.sname = sname;
		this.sid = sid;
		this.grade = grade;
	}
}
public class Demo {
	public static void main(String[] args) {
		
		List<Person> personList1 = new ArrayList<Person>();
		personList1.add(new Person("Smith", 101, 'A'));
		personList1.add(new Person("John", 102, 'B'));
		personList1.add(new Person("Smith", 103, 'C'));
		
		List<Person> personList2= new ArrayList<Person>();
		personList2.add(new Person("Scott", 104, 'A'));
		personList2.add(new Person("Mary", 105, 'B'));
		personList2.add(new Person("Kitty", 106, 'C'));
		
		List<List<Person>> PersonList = new ArrayList<List<Person>>();
		PersonList.add(personList1);
		PersonList.add(personList2);
		
		
//		  before java 8
		
		for(List<Person> s:PersonList) {
			for(Person per:s) {
				System.out.println(per.sname);
				
			}
		}
 		
		
 List<String>	 lop=	PersonList.stream().flatMap(plist->plist.stream().map(x->x.sname)).collect(Collectors.toList());
 System.out.println(lop);
	}

}

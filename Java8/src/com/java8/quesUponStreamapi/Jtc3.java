package com.java8.quesUponStreamapi;
// Display the students in Acending order by Name...............
import java.util.List;

import java.util.stream.Collectors;

import javax.xml.crypto.Data;
public class Jtc3 {

	public static void main(String[] args) {
		
		List<Student> stulist = DataUtil.getStudentList();
		stulist.stream().sorted((s1,s2)->s1.getName().compareTo(s2.getName())).forEach(System.out::println);
		
		System.out.println("-------------------------------\n");
		
		List<Student> mylist = stulist.stream().sorted((s1,s2)->s1.getName().compareTo(s2.getName())).collect(Collectors.toList());
		
		mylist.forEach(System.out::println);
		
	}
}

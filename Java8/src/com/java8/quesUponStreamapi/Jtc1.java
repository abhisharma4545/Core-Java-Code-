package com.java8.quesUponStreamapi;
// Dispaly the Studnet data;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Jtc1 {
	public static void main(String[] args) {
		List<Student> studentlist =DataUtil.getStudentList();
		studentlist.stream().forEach(System.out::println);
		System.out.println("----------------------------------\n");
		List<Student> mylist1 = studentlist.stream().collect(Collectors.toList());
		mylist1.forEach(System.out::println);
		System.out.println();
	}

}

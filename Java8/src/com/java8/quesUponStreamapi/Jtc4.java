package com.java8.quesUponStreamapi;
// Display the student who has to pay the Fee Balance in Desending Odered by Name....
import java.util.List;
import java.util.stream.Collectors;
public class Jtc4 {
	public static void main(String[] args) {
		List<Student> stulist = DataUtil.getStudentList();
		
		stulist.stream().sorted((s1,s2)->s2.getName().compareTo(s1.getName())).forEach(System.out::println);
		
		System.out.println("----------------------------");
		List<Student> mylist = stulist.stream().sorted((s1,s2)->s2.getName().compareTo(s1.getName())).collect(Collectors.toList());
		mylist.forEach(System.out::println);
	}

}
 
package com.java8.quesUponStreamapi;
//  Display the students who joined for devops Course
import java.util.List;
import java.util.stream.Collectors;
public class Jtc6 {
	public static void main(String[] args) {
		List<Student> stulist = DataUtil.getStudentList();
		stulist.stream().filter(m->(m.getCourseName().equals("Devops"))).forEach(System.out::println);
		
//		 Ascending order 
		System.out.println("---------ascending order-----");
		stulist.stream().filter(m->(m.getCourseName().equals("Devops"))).sorted((s1,s2)->s1.getName().compareTo(s2.getName())).forEach(System.out::println);
		
//		Decending order
		System.out.println("--------------descending order-------------");
		stulist.stream().filter(m->(m.getCourseName().equals("Devops"))).sorted((s1,s2)->s2.getName().compareTo(s1.getName())).forEach(System.out::println);
	}

}

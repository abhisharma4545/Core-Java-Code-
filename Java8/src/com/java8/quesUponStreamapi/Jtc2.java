package com.java8.quesUponStreamapi;
//Display the Student who has to pay the Fee Balance
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class Jtc2 {
	public static void main(String[] args) {
		List<Student> stulList = DataUtil.getStudentList();
		stulList.stream().filter(myStu->myStu.getFeeBal()>0).forEach(System.out::println);
		
		System.out.println("------------------------------");
		
		List<Student> mylist = stulList.stream().filter(m->m.getFeeBal()>0).collect(Collectors.toList());
		mylist.forEach(System.out::println);
		
		System.out.println("------------------------------------\n");
		
	}

}

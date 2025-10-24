package com.java8.quesUponStreamapi;
import java.util.Iterator;
// what is the Total Fee Bal to Receive Course-wise
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Jtc14 {
	public static void main(String[] args) {
		List<Student> l1 = DataUtil.getStudentList();
		Map<String, Double> stuMap = l1.stream().collect(Collectors.groupingBy(Student::getCourseName,Collectors.summingDouble(Student::getFeeBal)));
		 
		for(String coursename:stuMap.keySet()) {
			System.out.println(coursename+" :"+stuMap.get(coursename));
		}
		
	}

}

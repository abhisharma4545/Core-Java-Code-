package com.java8.quesUponStreamapi;
// what is the total fee Paid till now by course -wise....
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Jtc15 {
	public static void main(String[] args) {
		List<Student> l1= DataUtil.getStudentList();
		Map<String,Double> feePaidMap = l1.stream().collect(Collectors.groupingBy(Student::getCourseName,Collectors.summingDouble(Student::getFeePaid)));
		
		for(String coursename:feePaidMap.keySet()) {
			System.out.println(coursename+":-"+feePaidMap.get(coursename));
		}
		
		
	}

}

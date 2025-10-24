package com.java8.quesUponStreamapi;
// display the student Course-wise..
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java. util.stream.Collectors;

public class Jtc11 {
       public static void main(String[] args) {
		List<Student> l1= DataUtil.getStudentList();
		 Map<String,List<Student>> stuMap = l1.stream().collect(Collectors.groupingBy(Student::getCourseName));
//		 System.out.println(stuMap);
		 
		 for(String cname: stuMap.keySet()) {
			 List<Student> myList = stuMap.get(cname);
			 System.out.println("Student join for "+cname);
			 myList.forEach(System.out::println);
			 System.out.println("-----------------------");
		 }
		 
		
	}
}

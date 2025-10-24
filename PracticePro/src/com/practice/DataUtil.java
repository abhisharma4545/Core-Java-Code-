package com.practice;
import java.util.ArrayList;
import java.util.List;

public class DataUtil {
	public static List<Student> getStudentList(){
		List<Student> StudentList = new ArrayList();
		Student s1 = new Student(101, "som", 555, "Devops", 15000,0);
		Student s2 = new Student(102, "rai", 333,"MicroServices",15000, 3000);
		Student s3 = new Student(103, "som1",222, "MicroServices",19000, 0);
		Student s4 = new Student(104, "som2", 777,"Devops", 3000, 3000);
		Student s5 = new Student(105, "hello", 111,"Devops", 2000, 1500);
		Student s6 = new Student(106, "aaa",666, "Devops",13000, 2000);
		Student s7 = new Student(107, "hai", 444,"MicroServices", 25000, 5000);
		Student s8 = new Student(108, "bbb",123, "springBoot", 12500, 0);
		Student s9 = new Student(109, "ccc",321, "Spring Boot", 9000, 0);
		StudentList.add(s1);
		StudentList.add(s2);
		StudentList.add(s3);
		StudentList.add(s4);
		StudentList.add(s5);
		StudentList.add(s6);
		StudentList.add(s7);
		StudentList.add(s8);
		StudentList.add(s9);
		
		return StudentList;
	}

}

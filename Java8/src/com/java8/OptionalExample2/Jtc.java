package com.java8.OptionalExample2;
import  java.util.HashMap;
import java.util.Map;
import java.util.Optional;
public class Jtc {
	public static void main(String[] args) {
		Map<Integer, String> employeeDeopartments = new HashMap<>();
		employeeDeopartments.put(1, "Hr");
		employeeDeopartments.put(2, "IT");
		employeeDeopartments.put(3, "VITY");
//		founding the departments..
		int empId=2;
		Optional<String> deparments = Optional.ofNullable(employeeDeopartments.get(empId));
		String result =deparments.orElse("No deaparment found");
		System.out.println("Result:"+result);
		
		int empId1 =4;
		deparments = Optional.ofNullable(employeeDeopartments.get(empId1));
		result =deparments.orElse("No Deparments Found");
		System.out.println("Results:"+result);
		
	}
	

}

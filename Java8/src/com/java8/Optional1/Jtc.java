package com.java8.Optional1;
import java.util.Optional;
public class Jtc {
	public static void main(String[] args) {
//		of method
		String s1 = "Jtc1";
//		Optional<String> op1 = Optional.of(13123);
		Optional<String> op1 = Optional.of(s1);
		System.out.println(op1);
		System.out.println(op1.orElse("jtc43325"));
		System.out.println(op1);
		System.out.println(op1.isPresent());
		System.out.println(op1.get());
		if(op1.isPresent()) {
			System.out.println(op1.get());
			
		}else {
			System.out.println("No Value found");
		}
		System.out.println("*********************\n");
		String s2= "gdg";
//		Optional<String> op2=Optional.of(s2);
//		System.out.println(op2);
		
//		ofNullable method..............
		
		

		
		
	}
	

}

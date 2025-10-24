package com.java8.Optional;
import java.util.Optional;
public class Test {
	public static void main(String[] args) {
//		Optional op1 = Optional();
		Optional<String> op1 = Optional.empty();
		System.out.println(op1);
//        System.out.println(op1.get());	
		System.out.println(op1.toString());
		Optional op2 =Optional.empty();
		System.out.println(op1.hashCode());
		System.out.println(op2.hashCode());
		System.out.println("***************\n");
		Optional<String> op3 = Optional.empty();
		System.out.println(op3);
		System.out.println(op3.orElse("jtc1"));
		System.out.println(op3);
		System.out.println(op3.isPresent());
//        System.out.println(op3.get());		
		if(op3.isPresent()) {
			System.out.println(op3.get());
		}else {
			System.out.println("no value Found");
		}
	}

}

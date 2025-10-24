package com.jtc.functionalInterface;

import java.util.function.Predicate;

public class Jtc7 {
	public static void main(String[] args) {
		
		Predicate<Integer> predicate1 = (num) ->{
			System.out.println("Predicate 1");
			return num %2== 0;
		};
		
		Predicate<Integer> predicate2  = (num)->{
			System.out.println("Predicate 2");
			return num % 2 !=0;
		};
		
		Predicate<Integer> predicate3 = (num)->{
			System.out.println("predicate 3");
			return num >=25 && num <=50;
		};
		
		Boolean mybool = predicate1.and(predicate3).test(28);
		System.out.println(mybool);
	}

}

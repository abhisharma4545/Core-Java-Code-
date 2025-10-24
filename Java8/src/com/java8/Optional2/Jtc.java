package com.java8.Optional2;
import java.util.*;

public class Jtc {
	public static void main(String[] args) {
		String s1 ="Som";
		Optional<String> op1 =Optional.ofNullable(s1);
		//filter method in Optional
		Optional<String> op2 =op1.filter(input->input.contains("Som"));
		System.out.println(op2);
		//Map function in Optional
		String s11="som";
		Optional<String> op3=Optional.ofNullable(s11);
		 //public abstract R apply(T) method in Function Interface
		Optional<String > op4=op3.map(input->input.toUpperCase());
		System.out.println(op4);
		Optional<String> op5 =op3.map(input->new StringBuilder(input).reverse().toString());
		System.out.println(op5);
	}

}

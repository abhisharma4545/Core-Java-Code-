package com.java8.Optional2;
import  java.util.*;
public class Jtc3 {
	public static void main(String[] args) {
		String s1 ="som";
		 Optional<Optional<String>> op1 = Optional.of(Optional.ofNullable(s1));
		 System.out.println(op1);
		 System.out.println(op1.map(input->input));//Optional[Op
		 System.out.println(op1.flatMap(input->input));//Optional[som]
		 Optional<Optional<String>> op2 =op1.map(s->s.map(s11->s11.toUpperCase()));
		 System.out.println(op2);
		 Optional<String> o =Optional.ofNullable(s1);
		 System.out.println(o.flatMap(s->s));
	}
	

}

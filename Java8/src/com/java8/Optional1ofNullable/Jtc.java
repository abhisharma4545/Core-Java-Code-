package com.java8.Optional1ofNullable;
import java.util.Optional;

public class Jtc {
   public static void main(String[] args) {
//	   String s1="hello PAJI";
//	   Optional<String> op1 =Optional.ofNullable(s1);
//	  if(op1.isPresent()) {
//		  System.out.println(op1.get());
//	  }
//	   System.out.println("**********\n");
//	   op1.ifPresent(input->System.out.println(input));
//	   if(op1.isPresent()) {
//		   System.out.println(op1.get().toUpperCase());
//	   }
//	op1.ifPresent(input->System.out.println(input.toUpperCase()));
	   String s=null;
	   Optional<String> op3=Optional.of(s);//java.lang.NullPointerException
	   Optional<String> op2 =Optional.ofNullable(s);
	   System.out.println(op2.get());//java.util.NoSuchElementException
//	   System.out.println(op3.get());//java.lang.NullPointerException
}
}

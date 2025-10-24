package com.jtc.Stream;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class Jtc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<Integer> mylist =Arrays.asList(1,2,3,4,5,6,7,8);
       mylist.stream().peek(System.out::println).forEach(System.out::println);
       mylist.stream().filter(s->s%2==0).map(s->s*s).forEach(System.out::println);
       System.out.println("\n");
       mylist.parallelStream().forEach(System.out::println);
       
	} 

}

package com.jtc.NormalQuestion;

import java.util.*;
import java.util.stream.Collectors;

public class Jtc3 {
   public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
	List< Integer> list1= list.stream().filter(n->n%2 == 0).collect(Collectors.toList());
    List<Integer> list2 = list.stream().filter(n->n%2 !=0).collect(Collectors.toList());
    System.out.println("Evne number: -"+ list1);
    System.out.println("Odd Number:- " +list2);
    		
}
}

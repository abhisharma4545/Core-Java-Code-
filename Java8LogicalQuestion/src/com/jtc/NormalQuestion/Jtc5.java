package com.jtc.NormalQuestion;

import java.util.*;

// . Find the Second Highest Number in a List
//Input: [3,5,2,9,7,9]
//Output:7
//distinct() removes duplicates like the second 9.
//
//sorted(Comparator.reverseOrder()) sorts in descending order.
//
//skip(1) skips the first (largest) element.
//
//findFirst() picks the next one — the second highest. and return optional value with 
public class Jtc5 {
public static void main(String[] args) {
	  List<Integer> list = Arrays.asList(3,5,2,9,7,9);
//	  System.out.println(list.stream().findFirst());//optional [3]
Optional<Integer> op=  list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
	 //System.out.println("Second highest Number"+ op.orElse(null)); 
	if (op.isPresent()) {
        System.out.println("Second highest number: " + op.get());
    } else {
        System.out.println("Second highest number does not exist.");
    }
}
}

package com.jtc.NormalQuestion;
// Collectors.partitioningBy(predicate)

import java.util.*;
import java.util.stream.Collectors;
public class Jtc4 {
	
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

	        Map<Boolean, List<Integer>> partitioned = numbers.stream()
	            .collect(Collectors.partitioningBy(n -> n % 2 == 0)); // true for even, false for odd

	        System.out.println(partitioned);
	    }
	}



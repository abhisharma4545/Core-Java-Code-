package com.jtc.NormalQuestion;

import java.util.*;
import java.util.stream.*;

//Group a List of Strings by Their Length
//Input: ["apple", "bat", "car", "elephant", "dog"]
//Output: {3=[bat, car, dog], 5=[apple], 8=[elephant]

public class Jtc6 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("elephant","apple","bat","car","dog");
		Map<Integer, List<String>> group = list.stream().collect(Collectors.
				groupingBy(String::length ,TreeMap::new,Collectors.toList()));
		  System.out.println(group);
	}

}

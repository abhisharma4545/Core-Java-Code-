package com.jtc.NormalQuestion;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

// 1. Find the First Non-Repeated Character in a String Input: "programming"
public class Jtc1 {
	public static void main(String[] args) {
		String str = "pproogramming";
		Optional<Character> result = str.chars().mapToObj((c)->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new ,Collectors.counting()))
				.entrySet().stream().filter(e->e.getValue() ==1 ).map(Map.Entry::getKey).findFirst();
		System.out.println("Non repeated value   "+ result.orElse(null));
		
	}
	

}

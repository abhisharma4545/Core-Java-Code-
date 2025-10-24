package com.jtc.NormalQuestion;
//Find Duplicate Elements in a List
//Input: [1,2,3,4,5,6,2,4,6,7,8]
//Output: [2,4,6
import java.util.*;
import java.util.stream.Collectors;

public class Jtc2 {
	
   public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1,3,4,5,6,2,4,6,2,7,8);
	Set<Integer> seen = new HashSet<Integer>();
	 List<Integer> duplicates = list.stream().
			 filter(n->!seen.add(n)).distinct().collect(Collectors.toList());
	System.out.println("Duplicates"+ duplicates);
	
}
}

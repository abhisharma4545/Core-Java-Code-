package com.jtc.NormalQuestion;
//9. Find the Longest String in a List
//Input: ["cat", "elephant", "tiger"]
//Output: "elephant
import java.util.*;
public class Jtc10 {
  public static void main(String[] args) {
	List<String> list = Arrays.asList("cat","elephnat","tiger");
	Optional<String> longest = list.stream().max(Comparator.comparing(String::length));
	 longest.ifPresent(System.out::println);
}
}

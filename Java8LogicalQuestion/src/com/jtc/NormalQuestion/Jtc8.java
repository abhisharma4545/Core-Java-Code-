package com.jtc.NormalQuestion;
//Sort a List of Strings by Last Character
//Input: ["apple", "banana", "grape", "kiwi"]
//Output: ["banana", "apple", "grape", "kiwi"]
//(Sorted by last character
import java.util.*;

public class Jtc8 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple","banana","grape","kiwi");
	    list.sort(Comparator.comparing(s->s.charAt(s.length() - 1)));
	    System.out.println(list);
	}
  
}

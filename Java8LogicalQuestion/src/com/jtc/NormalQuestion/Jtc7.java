package com.jtc.NormalQuestion;

import java.util.*;
import java.util.function.Function;

import java.util.stream.Collectors;

public class Jtc7 {
  public static void main(String[] args) {
	String str = "hello world";
	Map<Character, Long> solution = str.chars().filter(c-> c  != ' ').sorted().
     mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),TreeMap::new,Collectors.counting()));
	
	     System.out.println(solution);                      
}
}

//Collectors.groupingBy(c -> c, Collectors.counting()) =
//Function.identity() retturn same argument 

//Using LinkedHashMap::new ensures the characters appear 
//in the order of their first sorted appearance. 
//
//If you want them to appear in natural character order (a to z),
//use TreeMap::new.
//input.chars() returns an IntStream of Unicode values.
//
//.filter(c -> c != ' ') excludes spaces.
//
//.mapToObj(c -> (char) c) converts int to char.


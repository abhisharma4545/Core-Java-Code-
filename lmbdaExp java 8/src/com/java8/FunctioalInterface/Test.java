package com.java8.FunctioalInterface;

import java.util.*;
import java.util.function.*;
public class Test {
	public static void main(String[] args) {
		List<String> names =Arrays.asList("som",null,"rai","jtc","vivek","noida");
		Predicate<String> nonEmptyString =(s)->s!=null && !s.isEmpty();
		System.out.println(filter(names, nonEmptyString));
		
	}
	public static <T> List<T> filter(List<T> list,Predicate<T> predicate){
		List<T> result =new ArrayList<T>();
		for(T obj:list) {
			if (predicate.test(obj)) {
				result.add(obj);
				
			}
			
			}
		    return result;
		
	}
	

}

package com.java8.FunctioalInterface;
import java.util.*;
import java.util.function.*;
public class Test1 {
	public static<T> void printEach(List<T> list,Consumer<T> consumer) {
		for(T obj:list) {
			consumer.accept(obj);
		}
		
	}
	public static void main(String[] args) {
		Consumer<Number> printNumber=(val)->System.out.println(val);
		Consumer<String> printString=(val)->System.out.println(val);
		List<String> names =Arrays.asList("som",null,"rai","jtc","vivek","noida");
		List<Number> values =Arrays.asList(12,34,454,6,56,56,1224);
		printEach(names,printString );
		printEach(values,printNumber); 
	}

}

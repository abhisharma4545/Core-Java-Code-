package com.jtc.functionalInterface;
import java.util.*;
import java.util.function.Consumer;

public class Test {
	public static <T> void printEach(List<T> list, Consumer<T> consumer ) {
		for( T obj:list) {
			consumer.accept(obj);
		}
		
	}
	public static void main(String[] args) {
		Consumer<Number> printNumConsumer = (Number val)->{
			System.out.println(val);
		};
		Consumer<String> printStringConsumer =(val)->{
			System.out.println(val);
			};
		List<String> names =Arrays.asList("som","rai","jtc","vivek","noida",null,"");
		List<Number> values =Arrays.asList(272,12,2323,22344,35);
		printEach(names, printStringConsumer);
		System.out.println("***************\n");
		printEach(values, printNumConsumer);
		
	
}

}

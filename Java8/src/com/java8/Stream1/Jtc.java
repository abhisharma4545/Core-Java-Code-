package com.java8.Stream1;
import java.util.*;
import java.util.stream.Stream;

public class Jtc {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");

        names.parallelStream()
             .forEach(name -> {
//            	 here multiple thread are executing in the parallelStream.....
                 System.out.println(Thread.currentThread().getName() + " - " + name);
             });
        List<Integer> l1=Arrays.asList(1,2,2,3,4,5,5,6,7,8,9,10,11,12,13,14,15,16,17);
        l1.stream().limit(9).forEach(System.out::println);
        l1.stream().skip(4).forEach(System.out::println);
        System.out.println("\n");
        l1.stream().limit(10).filter(num->num%2!=0).map(num->num*num).forEach(System.out::println);
        System.out.println("\n");
        l1.stream().skip(4).limit(9).forEach(System.out::println);
        System.out.println("peek start");
        l1.stream().skip(3).limit(5).peek(a->System.out.println(a)).forEach(b->System.out.println(b));
        System.out.println("peek end");

        l1.stream().limit(15).distinct().filter(num->num%2!=0).map(num->num*num).forEach(System.out::println);
        Stream<Integer> stream= l1.stream().peek(a->System.out.println(a));
       long i= stream.map(a->a).count();
       System.out.println("****");
       System.out.println(i);
       
        
	}

}

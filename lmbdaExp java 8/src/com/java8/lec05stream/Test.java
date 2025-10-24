package com.java8.lec05stream;
import java.util.*;
import java.util.stream.Stream;
class Hello{
	public static void show(int x) {
     System.out.println(x);		
	}
	
}
public class Test {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(22);
		l1.add(11);
		l1.add(14);
		l1.add(88);
		l1.add(438);
		l1.add(28);
		System.out.println("***to converted in to Stream");
//		1
		Stream<Integer> mystrem=l1.stream();
		mystrem.forEach(Hello::show);
//		2
		l1.stream().forEach(Hello::show);
//		3 instance method
		l1.stream().forEach(System.out::println);
//		4. Lambda Expression..
//		in this we provide Consumer interface's  accept(T) method implementations
		l1.stream().forEach((x)->System.out.println(x));
		
	}

}

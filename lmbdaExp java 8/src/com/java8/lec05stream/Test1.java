package com.java8.lec05stream;
import java.util.*;
import java.util.stream.Stream;
class MyNumber{
	static boolean isEven(int x) {
		if(x%2 == 0) 
			return true;
		else
			return false;
	}
	static boolean isOdd(int x) {
		if(x%2!= 0)
			return true;
		else
			return false;
	}
}

public class Test1 {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(8);
		l1.add(9);
		System.out.println("**Even NUmber**");
		l1.stream().filter(MyNumber::isEven).forEach(System.out::println);
		System.out.println("**Odd Number**");
		l1.stream().filter(MyNumber::isOdd).forEach(System.out::println);
		System.out.println("** Using Lambda Expression**");
		l1.stream().filter((a)->a%2==0).forEach((a)->System.out.println(a));
		l1.stream().filter(a->a%2!=0).forEach(a->System.out.println(a));
//		it is a Function interface method public abstract R apply(T); and   public abstract <R> java.util.stream.Stream<R>
//		map(java.util.function.Function<? super T, ? extends R>);
		l1.stream().filter(a->a%2==0).map(a->a*a).forEach(a->System.out.println(a));
	}
     
}

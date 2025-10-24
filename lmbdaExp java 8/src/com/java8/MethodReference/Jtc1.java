package com.java8.MethodReference;
@FunctionalInterface
interface Hello{
     int test(int a,int b);	
}
class MyInteger{
	static int findSum(int a,int b) {
		System.out.println("FindSum(int a,int b) in MyInteger");
		return a+b;
		
	}
}

public class Jtc1 {
	public static void main(String[] args) {
		System.out.println("main in Jtc1");
		Hello h1=(a,b)->{
			return a+b;
		};
		h1.test(10, 100);
		System.out.println("*********Using static method reference********");
		Hello h2=MyInteger::findSum;
		int c=h2.test(34, 45);
		System.out.println(c);
	}

}

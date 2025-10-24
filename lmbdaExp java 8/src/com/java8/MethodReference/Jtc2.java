package com.java8.MethodReference;
@FunctionalInterface
interface Hai{
	void test(String str);
}
@FunctionalInterface
interface Hello{
	int test(int a,int b);
}
class MyInteger1{
	public  int FindSum(int a,int b) {
		System.out.println("FindSum() method in MyInteger");
		return a+b;
	}
}

public class Jtc2 {
	public static void main(String[] args) {
		Hai h1 =(str)->{
			System.out.println("test in Hai");
		};
		Hello h2 =(a,b)->{
			System.out.println("Test in Hello");
			return a+b;
		};
		System.out.println("******instance method refrence");
		Hai h3=System.out::println;
		h3.test("Jtc");
		MyInteger1 m1=new MyInteger1();
		Hello h4=m1::FindSum;
		int x=h4.test(23, 23);
		System.out.println(x);
	}

}

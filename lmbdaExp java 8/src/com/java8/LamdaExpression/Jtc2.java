package com.java8.LamdaExpression;

@FunctionalInterface
interface I3{
	 int m1(int a,int b);
	
}
public class Jtc2 {
	public static void main(String[] args) {
		I3 i1 =(a,b)->{
			return a+b;
		};
		int x=i1.m1(10, 20);
		System.out.println(x);
		I3 i2=(a,b)->a+b;
		int x1=i2.m1(45, 35);
		System.out.println(x1);
	}

}

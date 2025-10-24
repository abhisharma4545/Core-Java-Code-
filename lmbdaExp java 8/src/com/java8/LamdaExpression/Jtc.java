package com.java8.LamdaExpression;
@FunctionalInterface
interface I1{
	void m1();
	default void m3() {
		System.out.println("Default Method in Function Interfacev I1");
	}
}
@FunctionalInterface
interface I2{
	void m1(String s1);
}

public class Jtc {
	public static void main(String[] args) {
		I1 i1=()->{
			System.out.println("M1 in jtc");
		};
		i1.m1();
		
		I1 i2=()->System.out.println("m1 in Jtc 22");
		i2.m1();
		I2 i11=(s1)->{
			System.out.println("m1 I2 in Jtc\t"+s1);
		};
		i11.m1("Abhishek");
	}

}

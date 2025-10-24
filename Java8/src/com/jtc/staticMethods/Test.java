package com.jtc.staticMethods;
interface I1{
	int a=10;//puclib static final by dfault
	void m1();// public abstract by dafault
//	abstract static void m11() {//not allowed}
//	default static void m12() {//not allowed}
	static void m3() {
		System.out.println("static method in m2");
		//m2(); //it not allowed
	}
	default void m2() {
		System.out.println("m2 in I1");
		m3();//it is allowed
	}
//	protected static void m4() {
		//not allowed bcz by default it is public..
//	}
}

public class Test {
	public static void main(String[] args) {
		I1.m3();
//		I1.m2();//not ok
	}
	

}

package com.jtc.staticMethods;
class Hello{
	void m11() {
		System.out.println("m11 in Hello");
	}
}
public interface I11{
	public static void main(String[] args) {
//		it is ok to write the main in Interface
		System.out.println("Hello Mian in I11");
		Hello h1  = new Hello();
		h1.m11();
		
	}
	
}


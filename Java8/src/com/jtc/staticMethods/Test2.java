package com.jtc.staticMethods;
interface I1{
	static void m1() {
		System.out.println("m1 in I1");
	}
	
}
interface I2{
	static void m1() {
		System.out.println("m1 in I2");
	}
	
}
class Hello implements  I1,I2{
	static void m1() {
//		new method m1 in Hello class
		
	}
	void show() {
//      m1();
//      m1();
      I1.m1();
      I2.m1();
	}
}

public class Test2 {
	public static void main(String[] args) {
		Hello h1 = new Hello();
		h1.show(); 
		
	}

}

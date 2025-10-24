package com.jtc.OopsWorkbook;

class A{
	 {
	 System.out.println("IB in class A"); 
	} 
	static{ 
	System.out.println("SB in class A"); 
	} 
	} 
	 public class JTC1{
	 A a1 = new A();
	 public static void main(String args[]){
	 System.out.println("main in class JTC"); 
	}
	 static{ 
	System.out.println("SB in class JTC");
	 new JTC1();
	 } 
	{ 
	System.out.println("IB in class JTC"); 
	}
	 } 
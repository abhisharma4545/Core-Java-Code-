package com.jtc.Example;
interface I5{
// default void mm1();
// default abstract void mm2();
// default static void mm2() {
//	 
// }
	default void mm1() {
		System.out.println("mm1 in I1");
	}
	default void mm2() {
		System.out.println("mm2 in I1");
		mm1();
		
	}
//	@Override here we can't override java.lang.Object method in interface with default keyword...
	//default boolean equals(Object obj) {
		
//	}
 }
interface I3{
	default void m1() {
		System.out.println("m1 i I3");
	}
}
interface I4 extends I3{
	default void m2() {
		System.out.println("m1 in I2");
		m1();// m1 mertod of I3
	}
	@Override// from I4
	public  default void  m1() {
		System.out.println();
		
	}
}

public class Ex {
	public static void main(String[] args) {
		
	}

}

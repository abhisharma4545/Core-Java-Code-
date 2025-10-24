package com.jtc.Singltondesign;
//  singlton Pattern design...............
class A{
	private static A h1;
	private A() {
		
	}
	static {
		h1=new A();
		System.out.println("sb in A");
	}
	public static A getA() {
		return h1;
	}
	
	
}
public class Jtc {

	public static void main(String[] args) throws Exception{
//		Class cls = Class.forName("com.jtc.Singltondesign.A");
//		A h5=(A)cls.newInstance();
//		System.out.println(h5.hashCode());
		A h2 = A.getA();
		A h3= A.getA();
		System.out.println(h2.hashCode());
		System.out.println(h3.hashCode());
		
		

	}

}

package com.jtc.Cloning;
class A1{
	int p;
	 A1(int p) {
		this.p=p;
	}
}
class B1{
	int q;
	A1 a1;
	B1(int q,A1 a1){
		this.q=q;
		this.a1=a1;
	}
}class C1{
	int r;
	B1 b1;
	C1(int r,B1 b1){
		this.b1=b1;
		this.r=r;
	}
}
class Hello1 implements Cloneable{
	int x;
	C1 c1;
	Hello1(int x,C1 c1){
		System.out.println("2 para Constructor");
		this.c1=c1;
		this.x=x;
	}
//	@Override the clone() Method
	public Object clone() throws CloneNotSupportedException{
		Class cls[]= this.getClass().getInterfaces();
		Hello1 h1= null;
//		checking Hello implements the cloneable interface or not ....... 
		if (cls[0].equals("java.lang.cloneable")) {
			A1 a1 = new A1(this.c1.b1.a1.p);
			B1 b1 = new B1(this.c1.b1.q,a1);
			C1 c1 = new C1(this.c1.r, b1);
			h1 = new Hello1(this.x,c1);
		}else {
			throw new CloneNotSupportedException();
		}
		return h1;
	}
	void show() {
		System.out.println("show in Hello1");
		System.out.println(x);
		 System.out.println(c1.r);
		 System.out.println(c1.b1.q);
		 System.out.println(c1.b1.a1.p);
	}
}
public class Jtc2 {

	public static void main(String[] args) {
		A1 a1 = new A1(66);
		B1 b1 = new B1(77, a1);
		C1 c1 = new C1(88, b1);
		Hello1 h1 = new Hello1(99, c1);
		h1.show();
		try {
		Hello1 h2 = (Hello1)h1.clone();
		 h2.show();
		}catch (Exception e) {
			System.out.println(e);
		}
		
		

	}

}

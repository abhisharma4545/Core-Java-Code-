package com.jtc.Cloning;
class A{
	int p;
	 A(int p) {
		 this.p=p;	
	}
}
class B{
	int q;
	A a1;
	B(int q,A a1) {
		this.q=q;
		this.a1=a1;
	}
}
class C{
	int r;
	 B b1;
	C(int r,B b1){
		this.b1=b1;
		this.r=r;
		
	}
}
public class Jtc {
     public static void main(String[] args) {
		A a1 = new A(66);
		B b1 = new B(99, a1);
		C c1 = new C(100,b1);
		Hello h1 = new Hello(88, c1);
		Hello h2 =h1.myClone();
		h2.show();

	}

}
// how to clone the shallow cloning.........
 class Hello implements Cloneable{
	 int x;
	 C c1;
	 Hello(int x,C c1){
		 this.c1=c1;
		 this.x = x;
	 }
	 void show() {
		 System.out.println(x);
		 System.out.println(c1.r);
		 System.out.println(c1.b1.q);
		 System.out.println(c1.b1.a1.p);
	 }
 
 public Hello myClone() {
	 Hello h1 = null;
	 try {
		h1 =(Hello)this.clone();
	} catch (CloneNotSupportedException e) {
		 System.out.println("this  class is not ready for cloning"+e);
		
	}
	 return h1;
	 
	 
 }
 }

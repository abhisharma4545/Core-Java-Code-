package com.jtc.WorkbookMulti;

//Example on method level Synchronized ...................
public class Jtc5 {

	public static void main(String[] args) {
		HelloJtc1 h = new HelloJtc1();
		A12 a1 =new A12(h,"A");
		B12 b1 =new B12(h,"B");

	}

}
class HelloJtc1{
	 void m1() {
		for(int i=0;i<=5;i++) {
			System.out.println("m1-"+i);
			}
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		}
	 void m2() {
		for(int i=10;i<=15;i++) {
			System.out.println("m2-"+i);
		}
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
class A12 implements Runnable{
	 HelloJtc1 h = null;
	 A12(HelloJtc1 h,String tname){
		 this.h=h;
		 Thread t1 = new Thread(this,tname);
		 t1.start();
		 System.out.println(t1.getThreadGroup().getName());
		 
	 }
	public void run(){
		h.m1();
		
	}
}
class B12 implements Runnable{
	HelloJtc1 h = null;
	B12(HelloJtc1 h,String tname){
		this.h=h;
		Thread t2 = new Thread(this,tname);
		t2.start();
		System.out.println(t2.getThreadGroup().getName());
	}
	public void run() {
		h.m2();
		
	}
}

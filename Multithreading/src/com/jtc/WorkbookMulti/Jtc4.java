package com.jtc.WorkbookMulti;
// Example on method level Synchronized ...................
public class Jtc4 {

	public static void main(String[] args) {
		HelloJtc h = new HelloJtc();
		A a1 =new A(h,"A");
		B b1 =new B(h,"B");

	}

}
class HelloJtc{
	synchronized void m1() {
		for(int i=0;i<=5;i++) {
			System.out.println("m1-"+i);
			}
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		}
	synchronized void m2() {
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
class A implements Runnable{
	 HelloJtc h = null;
	 A(HelloJtc h,String tname){
		 this.h=h;
		 Thread t1 = new Thread(this,tname);
		 t1.start();
		 System.out.println(t1.getThreadGroup().getName());
		 
	 }
	public void run(){
		h.m1();
		
	}
}
class B implements Runnable{
	HelloJtc h = null;
	B(HelloJtc h,String tname){
		this.h=h;
		Thread t2 = new Thread(this,tname);
		t2.start();
		System.out.println(t2.getThreadGroup().getName());
	}
	public void run() {
		h.m2();
		
	}
}

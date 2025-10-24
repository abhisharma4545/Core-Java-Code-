package com.jtc.multiT;
//  class level Synchronization..............
class B{
	synchronized static void m1() {
		for(int i=1;i<=15;i++) {
			System.out.println(Thread.currentThread().getName()+"is processing:-"+i);
		}
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class Thread11 extends Thread{
	B a1;
	public Thread11(B a1) {
		this.a1=a1;
	}
	public void run() {
		a1.m1();
	}
}
class Thread22  extends Thread{
	B a1;
	public Thread22(B a1) {
		this.a1= a1;
	}
	public void run() {
		a1.m1();
	}
	
}
public class Test9 {

	public static void main(String[] args) {
		B a1= new B();
		B a2  = new B();
		Thread11 t1 = new Thread11(a1);
		Thread22 t2 = new Thread22(a2);	
		t1.setName("T1");
		t2.setName("T2");
		t1.start();
		t2.start();

	}

}

package com.jtc.multiT;
//  Block level synchronization.........
class A{
	void m1() {
		try {
			synchronized (this) {
				for(int i = 1;i<=10;i++) {
					System.out.println(Thread.currentThread().getName()+"is processing synchronized-block"+i);
					Thread.sleep(500);
				}	
			}
			for(int i = 1;i<=10;i++) {
				System.out.println(Thread.currentThread().getName()+"is processing Asynchronized-block"+i);
				Thread.sleep(500);
			}
		} catch ( Exception e) {
			e.printStackTrace();
		}
	}
}
class Thread1 extends Thread{
	A a1;
	public Thread1(A a1) {
		this.a1=a1;
		
	}
	public void run() {
		a1.m1();
	}
}
class Thread2 extends Thread{
	A a1;
	public Thread2(A a1) {
		this.a1=a1;
	}
	public void run() {
		a1.m1();
	}
}
public class Test8 {

	public static void main(String[] args) {
		A a1 = new A();
		Thread1 t1 = new Thread1(a1);
		Thread2 t2 = new Thread2(a1);
		t1.setName("T1");
		t2.setName("T2");
		t1.start();
		t2.start();

	}

}

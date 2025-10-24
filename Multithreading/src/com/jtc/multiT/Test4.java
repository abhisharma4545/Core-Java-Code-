package com.jtc.multiT;
// synchronization concept on method level synchronization...................
class Hello{
	synchronized void m1() {
		for(int i=0;i<5;i++) {
		System.out.println(Thread.currentThread().getName()+"  Under the Thread Group  "+Thread.currentThread().getThreadGroup().getName());
		}
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	void m2() {
		
	}
	
}
class AThread implements Runnable{
	Hello h1 =null;
	 AThread() {
		
	}
	 AThread(String tname,Hello h1){
		 this.h1=h1;
		 Thread th1 = new Thread(this,tname);
		 th1.start();
	 }
	 public void run() {
		 h1.m1();
	 }
	
}
class BThread implements Runnable{
	Hello h1 =null;
	 BThread() {
		
	}
	 BThread(String tname,Hello h1){
		 this.h1=h1;
		 Thread th1 = new Thread(this,tname);
		 th1.start();
	 }
	 public void run() {
		 h1.m1();
	 }
	
}
public class Test4 {
	public static void main(String[] args) {
		Hello h1 = new Hello();
		AThread t1 =new AThread("t1",h1);
		BThread t2 =new BThread("t2",h1);
		
	}

}

package com.jtc.multiT;
// Creating thread by implementing Runnable interface.........
class HelloThread2 implements Runnable{
	
	 HelloThread2() {
		Thread t1 = new Thread(this);
		t1.start();
	}
	HelloThread2(String tname){
		Thread t2= new Thread(this,tname);
		t2.start();
		
	}
	HelloThread2(String tname,ThreadGroup tg){
		Thread t3 = new Thread(tg,this,tname);
		t3.start();
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+"  Under the ThreadfGroup/t"+Thread.currentThread().getThreadGroup().getName());
		}
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
public class Test2 {
	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("Jtc=threadGroup");
		HelloThread2 t1 = new HelloThread2();
		HelloThread t2 = new HelloThread("Jtc-1");
		
	}

}

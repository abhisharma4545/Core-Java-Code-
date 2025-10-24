package com.jtc.multiT;




 class Abhi  extends Thread{
	 
	 
	 @Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread name"+Thread.currentThread().getName() );
	}
	 
	 
 }
 
 class service extends Thread{
	 
	 @Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		 Thread.s
		 System.out.println(Thread.currentThread().getThreadGroup().getName());
		 
	}
 }














public class Practice {
	
	public static void main(String[] args) {
		Abhi a = new Abhi();
		service s = new service(service ,"s1");
		s.start();
		
		try {
	           a.sleep(45654);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {
//			//t1.sleep(100);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}

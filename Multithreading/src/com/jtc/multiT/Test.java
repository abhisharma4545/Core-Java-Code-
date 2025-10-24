package com.jtc.multiT;


// Creating thread By Extending the Thread Class............

class HelloThread extends Thread {
       public HelloThread() {
    	   super();
    	   start();
       }
       HelloThread(String tname){
    	   super(tname);
    	   
       }
       HelloThread(String tname,ThreadGroup tg){
    	   super(tg,tname);
       }
       public void run() {
    	   for(int i=0;i<5;i++) {
    	   System.out.println(Thread.currentThread().getName()+"\tUnder the Threadgroup:\t"+Thread.currentThread().getThreadGroup().getName());
    	   }
    	   
       try {
	    	Thread.sleep(500);
	    }catch(Exception e){
	    	System.out.println(e);
	    }
    	   
}
public class Test{
	public static void main(String[] args) {
		ThreadGroup tg =new ThreadGroup("Jtc-Thread group");
		HelloThread  t1 =new HelloThread();
		HelloThread  t2 = new HelloThread("Jtc-thread");
		HelloThread t3 = new HelloThread("jtc-thread",tg);
		
	   
	}
}
}
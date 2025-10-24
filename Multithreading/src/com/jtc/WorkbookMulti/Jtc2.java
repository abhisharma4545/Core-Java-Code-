package com.jtc.WorkbookMulti;
// Example using start() and run() methods..........
public class Jtc2 {
   public static void main(String[] args)  {
	      JtcThread jt1 = new JtcThread();
		  jt1.setName("JtcThread");
		  jt1.start();
//		  Thread.sleep(3000);
		  
		Thread th = Thread.currentThread();
		System.out.println(th);
		for(int i=100;i<110;i++) {
			if(i==105) {
				try{
					int x=10/0;
					System.out.println(x);
				
				}catch (Exception e) {
					System.out.println(e);
				}
			}
		}
		

	}

}
class JtcThread extends Thread{
//	JtcThread(){
//		
//	}
	public void run() {
		Hello12 h= new Hello12();
		h.show();
	}
}
class Hello12{
	void show() {
		Thread th = Thread.currentThread();
		for(int i=0;i<10;i++) {
			System.out.println("Show\t"+i+"\t"+th.getName());
		}
	}
	
}

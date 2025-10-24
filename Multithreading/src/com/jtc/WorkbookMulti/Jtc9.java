package com.jtc.WorkbookMulti;
// Example using daemon Thread.............
public class Jtc9 {
       public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloJtc45 h= new HelloJtc45();
		JTCThread11 jth = new JTCThread11(h);
		jth.setDaemon(true);
		jth.start();
		new Employee();
		System.gc();
		Thread th =Thread.currentThread();
		for(int i=0;i<15;i++) {
			System.out.println("In Main\t:"+h.val+"\t"+th.isDaemon());
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

}
class JTCThread11 extends Thread{
	 HelloJtc45 h = null;
	 JTCThread11(HelloJtc45 h){
		 this.h=h;
	 }
	 @Override
	public void run() {
		// TODO Auto-generated method stub
		  for(int i=0;i<152;i++) {
			  h.val=i;
			  System.out.println("Storing the data\t"+i+"\t"+isDaemon());
			  try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		  }
	}
}
class HelloJtc45{
   int val;	
}
class Employee{
	@Override
	protected void finalize()  {
		// TODO Auto-generated method stub
		Thread th = Thread.currentThread();
		for(int i=100;i<900;i++) {
			System.out.println(th.getName()+"\t"+th.isDaemon()+"\t"+i);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}
}
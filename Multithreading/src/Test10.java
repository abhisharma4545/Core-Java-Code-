class Hello {
	synchronized  static void m1() {
		System.out.println(Thread.currentThread().getName()+ "Under the threadGroup of "+Thread.currentThread().getThreadGroup().getName());
	
	try {
		Thread.sleep(500);
	}catch(Exception e) {
		System.out.println(e);	
		}
	}
	void m2() {
		
	         }
	}
class AThread implements Runnable{
	Hello h1 = null;
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
	Hello h1 = null;
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
public class Test10 {

	public static void main(String[] args) {
		Hello h1 = new Hello();
		Hello h2 = new Hello();
		AThread ath = new AThread("T1",h1);
		BThread bth = new BThread("T2",h2);
		

	}

}

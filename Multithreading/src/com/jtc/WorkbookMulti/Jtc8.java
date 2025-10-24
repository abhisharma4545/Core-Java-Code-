package com.jtc.WorkbookMulti;
// Example using join() methods.......... 
public class Jtc8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JtcThread11 ath = new JtcThread11();
		JtcThread22 bth = new JtcThread22();
		bth.setThreadToJoin(ath);
		ath.start();
     	bth.start();

	}

}
class JtcThread11 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<15;i++) {
			System.out.println("JTH1\t"+i);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}	
	}
	
}
class JtcThread22 extends Thread{
	Thread th = null;
	void setThreadToJoin(Thread th) {
		this.th=th;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
	    for(int i=100;i<115;i++) {
	    	System.out.println("Jth2\t"+i);
	    	try {
				if(i==105) {
					th.join();
				}
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	    }
	}
	
	}


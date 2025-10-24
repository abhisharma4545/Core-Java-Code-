package com.jtc.WorkbookMulti;
// Example using run() and start() methods
public class Jtc3 {
     public static void main(String[] args) {
    	 JtcThread1 jth1 = new JtcThread1();
    	 JtcThread2 jth2 = new JtcThread2();
    	 jth1.start();
    	 jth2.start();
	}

}
class JtcThread1 extends Thread{
	public void run() {
		Service serv = new Service();
		serv.downloadFile();
	}
}
class JtcThread2 extends Thread{
	public void run() {
		Service serv = new Service();
		serv.readJtcStudentInfo();
	}
	}
		

class Service{
	void downloadFile() {
		for(int i=0;i<=100;i+=5) {
			System.out.println("Download\t"+i+"%");
//			try {
//				Thread.sleep(500);
//			} catch (Exception e) {
//				System.out.println(e);
//			}
			}
		}
	void readJtcStudentInfo() {
		for(int i=0;i<51;i++) {
			System.out.println("JtcStudent with id\t"+i+"\tInformation");
//			try {
//				Thread.sleep(500);
//			}catch (Exception e) {
//				System.out.println(e);
//			}
		}
	}
}
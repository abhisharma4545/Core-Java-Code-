package com.jtc.WorkbookMulti;
// Example using simple thread...........
public class Jtc10 {
       public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup tg = new ThreadGroup("B10-12");
		JtcThread12 jht1 = new JtcThread12(tg,"JAVA");
		JtcThread12 jth2 = new JtcThread12("JDBC");
		jth2.setPriority(9);
//     	jth2.setPriority(0);
		JtcThread12 jth3 = new JtcThread12(tg,"EJB");
		jth3.setPriority(2);
		JtcThread12 jth4 = new JtcThread12("XML");
		new HelloStudent();
		System.gc();
		jht1.start();
		jth2.start();
		jth3.start();
		jth4.start();
		Thread th =Thread.currentThread();
		ThreadGroup tg1 =th.getThreadGroup();
		System.out.println("IN Main\t"+tg1.getName());
		try {
//			tg1.stop();
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}

}
class JtcThread12 extends Thread{
	 JtcThread12(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	 JtcThread12(ThreadGroup tg,String name) {
		// TODO Auto-generated constructor stub
		 super(tg,name);
	}
	 @Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			ThreadGroup tg = getThreadGroup();
			System.out.println(getName()+"\t"+i+getPriority()+"\t"+tg.getName());
		}
	}
}
class HelloStudent{
	 public void finalize() {
		 Thread th =Thread.currentThread();
		  ThreadGroup tg = th.getThreadGroup();
		  System.out.println(th.getName()+"\t"+th.getPriority()+"\t"+tg.getName());
		  JtcThread12 jth1 = new JtcThread12("JSP");
		  jth1.start();
		  ThreadGroup tg1 = new ThreadGroup("JTC");
		  JtcThread12 jth2 = new JtcThread12("-WS");
		  jth2.start();
		  
	 }
}
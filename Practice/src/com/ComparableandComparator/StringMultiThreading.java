

package com.ComparableandComparator;


class hello{
	hello(){
		
	}
	hello(int x){
		System.out.println(x);
		
	}
}

public class StringMultiThreading  extends Thread {
	
	public static void main(String[] args) {
		  hello h = new hello(1);
	}
	
	
//	String sharedString= new String("Abhishek");
//	   public static void main(String[] args) {
//		    
//		   StringMultiThreading s1 = new StringMultiThreading();
//		   StringMultiThreading s2 = new StringMultiThreading();
//		   StringMultiThreading s3= new StringMultiThreading();
//		   
//		   s1.start();
//		   s2.start();
//		   s3.start();
//		
//	}
//	   
//	   @Override
//	public void run() {
//		  
//		    sharedString = sharedString+ "sharma";
//		   
//		   System.out.println(Thread.currentThread().getName()+sharedString);
//		   
//	}

}

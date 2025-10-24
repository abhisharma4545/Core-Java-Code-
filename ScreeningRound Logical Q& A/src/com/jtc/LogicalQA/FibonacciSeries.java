package com.jtc.LogicalQA;

public class FibonacciSeries {
	
	    static int a=0;
	    static int b=1;
	    static  int c;
	 public static void main(String[] args) { 
		 System.out.print(a + " "+ b);
		 FibonacciSeries fb = new  FibonacciSeries();
		 fb.Fibo(10);
		 
		
	}
	 void Fibo(int n) {
		 if(n>=1) {
			 c = a+b;
			 System.out.print(" "+c);
			 a = b;
			 b=c;
			 
			 Fibo(n-1);
			    
		 }
	 }

}

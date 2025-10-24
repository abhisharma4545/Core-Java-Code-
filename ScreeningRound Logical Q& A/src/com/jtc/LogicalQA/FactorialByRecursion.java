package com.jtc.LogicalQA;

public class FactorialByRecursion {
	   static int  fact = 1;
	public static void main(String[] args) {
		
		FactorialByRecursion ob = new FactorialByRecursion();
		     int res =ob.Fact(5);
		     System.out.println("Factorial of "+ res);
		
	}
	
    public static int Fact(int a) {
    	if (a>=1) {
    		fact = fact*a;
    		Fact(a-1);
    	}
    	return fact;
    }

}

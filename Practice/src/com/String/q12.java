package com.String;

public class q12 {
	   public static void main(String[] args) {
		   new sub();
	}

}
class Super{
	public Super() {
		// TODO Auto-generated constructor stub
		this.print();
	}
	void print() {
		System.out.println(" print of super");
	}
	
}
class sub extends Super{
     static	int x = 10;
     
     public sub() {
		super();
    	 
	}
	
	void print() {
		System.out.println("print of sub \t"+ x);
	}
	
}
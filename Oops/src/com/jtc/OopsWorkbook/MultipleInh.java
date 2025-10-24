package com.jtc.OopsWorkbook;
// Example using Limitation of multiple Inheritance.......
interface Inter11{
	void show();
}
interface Inert22{
	int show();
}
// Here  in the following class limits of multiple inheritence both interface has same method name 
//  class  Cd implements Inert11,Inter22{
//	public void show() {
//		
//	}
//      public int show() {
//    	  
//      }


//  }
class Ab implements Inter11{
	public void show() {
		
	}
}
class Bc implements Inert22{
	@Override
	public int show() {
		// TODO Auto-generated method stub
		return 0;
	}
}

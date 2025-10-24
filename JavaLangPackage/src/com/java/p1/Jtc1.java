package com.java.p1;


class Jtc1{
	private Jtc1(){}
	private static Jtc1 j1;
	 static {
		 j1 = new Jtc1();
	 }
	 public static Jtc1 getJtc(){
		 return j1;
	 }
	 
}
class Hello{
  public static void main(String[] args) {
	  Jtc1 j1 = Jtc1.getJtc();
	  Jtc1 j2 = Jtc1.getJtc();
	  System.out.println(j1==j2);
  }
}
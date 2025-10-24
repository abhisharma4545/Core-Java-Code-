package com.jtc.multiT;

public class Test3 {
	public static void main(String[] args) {
		Thread t1 = new Thread();
		System.out.println(t1.getPriority());
		t1.setPriority(10);
		System.out.println(t1.getPriority());
		System.out.println(t1);
	}

}

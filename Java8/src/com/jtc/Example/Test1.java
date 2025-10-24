package com.jtc.Example;
interface I1{
	default void show() {
		System.out.println("show in I1");
	}
}
interface I2{
	default void show() {
		System.out.println("show in I2");
	}
}
class Hello implements I1,I2{
	public void show() {
		System.out.println("show in  Hello");
	}
	void showAll() {
		System.out.println("showAll in Hello");
		show();
		I1.super.show();//show in I1
		
		I2.super.show();//show in I2
	}
}

public class Test1 {
	public static void main(String[] args) {
		Hello h1 = new  Hello();
		h1.showAll();
	}

}

package com.jtc.p1;
interface I1{
	
}
interface I2{
	
}
class Hello  implements I1,I2{
	int a=99;
	int b;
	 Hello() {
		System.out.println("Default constructor in java");
	}
	 Hello(int b){
		 System.out.println("1 para contr in Hello");
		 this.b=b;
	 }
	 void show() {
		 System.out.println("show in Hello");
		 System.out.println(a);
		 System.out.println(b);
	 }
}
public class Jtc1 {

	public static void main(String[] args) throws Exception {
		Hello h1 = new Hello();
		h1.show();
		System.out.println("*******************\n");
		Class cls = Class.forName("com.jtc.p1.Hello");
//		 it is way to create an object/instances of a class by newInstance method (it had been depricated from java 13or 14
		Hello h2 = (Hello)cls.newInstance();
		h2.show();
		System.out.println("\n******Abbout the class**********\n");
		ClassLoader c1 = cls.getClassLoader();
		System.out.println(c1);
		System.out.println("**********************\n");
		System.out.println(cls);
//		it will print fullyQaulified name with class keyword.... to call toString method internally
		System.out.println(cls.getName());
		System.out.println(cls.getPackageName());
		System.out.println(cls.getSuperclass());
		Class cls1[]= cls.getInterfaces();
		for(int i= 0;i<cls1.length;i++) {
			System.out.println(cls1[i].getName());
		}
	}

}

package com.jtc.OopsWorkbook;
// Example to show that class will be loaded only once...
public class Jtc14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In Main Method Loading the Hello Class");
		ClassLoader loader = Jtc14.class.getClassLoader();
		try {
		Class.forName("com.jtc.OopsWorkbook.Hello",false,loader);
		System.out.println("--Class Loaded Successfully--");
		System.out.println("Delete the .class file and press Enter");
		System.in.read();
		Hello h = new Hello();
		h.show();
		h.display();
		new Hello(12).show();
		new Hello(89, "JTC").show();
		new Hello().display();
		System.out.println(Hello.value);
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		}

}
class Hello{
	int ab;
	String msg;
	static int value =1234;
	 Hello() {
		// TODO Auto-generated constructor stub
		 System.out.println("--Hello()Cons--");
	}
	 Hello(int ab){
		 System.out.println("---Hello(int)Cons--");
		 
	 }
	 Hello(int ab,String msg){
		 System.out.println("---Hello(int,string)Cons--");
	 }
	 void show() {
		 System.out.println("--show()in Hello--");
		 System.out.println(ab);
		 System.out.println(msg);
	 }
	 void display() {
		 System.out.println("**display()in Hello**");
	 }
}

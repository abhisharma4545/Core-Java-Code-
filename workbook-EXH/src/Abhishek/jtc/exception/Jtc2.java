package Abhishek.jtc.exception;

public class Jtc2 {
public static void main(String [] as) {
	System.out.println("main begin");
	String s = null;
	try {
		s= as[0];	
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Please Provide the value");
		System.out.println(e);
	}
	int x =0;
	try {
		x=Integer.parseInt(s);
		System.out.println(x);
	}
	catch (NumberFormatException e) {
		System.out.println("Please Provide integer number");
		System.out.println(e);
	}
	try {
		int y= 10/x;
		System.out.println(y);
	}
	catch (ArithmeticException e) {
		System.out.println("Please Dont Provide Zero");
		System.out.println(e);
	}
	System.out.println("main end");

}
}

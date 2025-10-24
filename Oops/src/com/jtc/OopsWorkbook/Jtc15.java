package com.jtc.OopsWorkbook;
// Example in static InnerClass...............
import com.jtc.OopsWorkbook.MyOuterClass.MyInnerClass;

public class Jtc15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MyOuterClass.MyInnerClass.LENGTH);
		System.out.println(MyOuterClass.MyInnerClass.val);
		MyOuterClass.MyInnerClass.displayMessage();
//     	MyInnerClass ref1 = null;
		MyOuterClass.MyInnerClass ref = null;
	   System.out.println(ref.msg);
	    ref = new MyOuterClass.MyInnerClass("Message from Main  Method");
//		here both are not allowed for the static class object instantiations.......
//		ref = new MyOuterClass().new MyInnerClass("Message from main Method");
//		ref = new MyOuterClass().MyInnerClass("Message from Main Method");
		System.out.println(ref.msg);
		MyOuterClass.displayInOuterClass();
		new MyOuterClass().showInOuterClass();
		ref.showResult();
		

	}

}
class MyOuterClass{
	 int result = 1045;
	 static int value = 1212;
	 static class MyInnerClass{
		 static int val = 9090;
		 static final int LENGTH=10;
		 String msg;
		  MyInnerClass(String msg) {
			// TODO Auto-generated constructor stub
			  this.msg=msg;
		}
		  static void displayMessage() {
			  System.out.println("---displayMessage static in Inner Class--");
		  }
		  void showResult() {
			  System.out.println("n--showResult() in Inner Class--");
			  System.out.println("MSG\t:"+msg);
			  System.out.println("val\t:"+val);
			  System.out.println("**Member of Outer Class**");
			  System.out.println("static \t:"+value);
//			  System.out.println("ins\t:"+result);
			  System.out.println("ins\t:"+new MyOuterClass().result);
			 }
		  }
	 void showInOuterClass() {
		  System.out.println("\n--showInOuterClass--");
		  MyInnerClass ref1 = new MyInnerClass("Message in Display Method");
		  System.out.println(ref1.msg);
	 }
	 static void displayInOuterClass() {
		 System.out.println("\n--diaplayInOuterClass--");
		 MyInnerClass ref1 = new MyInnerClass("Message in Display Method");
		 System.out.println(ref1.msg);
	 }
}
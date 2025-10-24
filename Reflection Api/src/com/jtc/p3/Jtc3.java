package com.jtc.p3;
//  Reflection api related codes
import java.lang.reflect.Method;

class Hello{
	void m1(String s1,String s2) {
		System.out.println("M1 in Hello");
	}
	void m2(int a,int b) {
		System.out.println("M2(int a,int b)in Hello");
		System.out.println(a);
	    System.out.println(b);
	}
	void showAll() {
		System.out.println("showAll in Hello");
	}
     private void mPrivate() {
//	   here private method is also access only name not body of that method in the getDeclared Method.....
	  System.out.println("mPrivate method in Hello");
		
	}
}
public class Jtc3 {

	public static void main(String[] args) {
		try {
			Class cls = Class.forName("com.jtc.p3.Hello");
			Hello h = (Hello)cls.newInstance();
		Method m[]= cls.getDeclaredMethods();
		 for(int i=0;i<m.length;i++) {
			 System.out.println("Name:-"+m[i].getName());
			 if (m[i].getName().equals("m1")) {
				 String s[]= {"Hello","Jtc"};
				 m[i].invoke(h,s);
				
			}
			 if (m[i].getName().equals("showAll")) {
				 String s[]= {"Hello","Jtc"};
				 m[i].invoke(h,null);
				
			}
			 if (m[i].getName().equals("mPrivate")) {
				 String s[]= {"Hello","Jtc"};
				 m[i].invoke(h,null);
				
			}
		 }
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}

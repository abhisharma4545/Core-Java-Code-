package com.jtc.CollectionWorkbook;
// Example using StringTokenizer Class..
import java.util.*;
public class Jtc12 {

	public static void main(String[] args) {
		String str="Welcome to Java Training Center to learn java and advanced java thankyou";
		StringTokenizer token = new StringTokenizer(str);
		System.out.println(token.hasMoreElements());

		System.out.println(token.countTokens());
		while (token.hasMoreElements()) {
			String  str1 = (String) token.nextElement();
			System.out.println(str1);
			
		}
		System.out.println(token.hasMoreElements());
		System.out.println(token.countTokens());
		StringTokenizer token1=new StringTokenizer(str,"ja");
		System.out.println(token1.hasMoreTokens());
		System.out.println(token1.countTokens());
		while (token1.hasMoreElements()) {
			Object object = (Object) token1.nextElement();
			System.out.println(object);
			
		}
		

	}

}

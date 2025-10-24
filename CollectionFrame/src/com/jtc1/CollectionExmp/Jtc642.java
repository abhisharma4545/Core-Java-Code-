package com.jtc1.CollectionExmp;
import java.util.*;
public class Jtc642 {
	public static void main(String[] args) {
		Map myMap = new HashMap();
		System.out.println(myMap.isEmpty());
		myMap.put("sid",101);
		myMap.put("sname","Som Prakash");
		myMap.put("email","som@gmail.com");
		myMap.put("phone",1235456);
		myMap.put("city","Noida");
		System.out.println(myMap);
		System.out.println(myMap.remove("Som"));
		System.out.println(myMap.remove("city"));
		System.out.println(myMap.containsKey("mycity"));
		System.out.println(myMap.containsValue(101));
		System.out.println(myMap.containsValue("Noida"));
		System.out.println(myMap.containsValue("Som"));
		System.out.println(myMap.remove("Som"));
		System.out.println(myMap.remove("city"));
		System.out.println(myMap);
		System.out.println(myMap.replace( "sid",105));
		System.out.println(myMap.replace("city","Delhi"));
	     System.out.println(myMap);
	     myMap.put("city","Noida");
	     System.out.println(myMap);
	     System.out.println(myMap.replace("city", "Delhi"));
	     System.out.println(myMap);
	     myMap.clear();
	     System.out.println(myMap);

	     
		}

}

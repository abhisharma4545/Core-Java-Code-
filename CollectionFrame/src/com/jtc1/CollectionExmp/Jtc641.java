package com.jtc1.CollectionExmp;
import java.util.*;
public class Jtc641 {
	public static void main(String[] args) {
		Map myMap = new HashMap();
		System.out.println(myMap.isEmpty());
		myMap.put("sid",101);
		myMap.put("sname","Som Prakash");
		myMap.put("email","som@gmail.com");
		myMap.put("phone",1235456);
		myMap.put(999999,9999999);
		myMap.put(null,null);
		System.out.println(myMap.size());
		System.out.println(myMap.isEmpty());
		System.out.println(myMap);
		System.out.println(myMap.get("email"));
		System.out.println(myMap.get("phone"));
	}

}

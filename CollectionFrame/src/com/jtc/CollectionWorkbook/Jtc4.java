package com.jtc.CollectionWorkbook;
// Example using HashSet,TreeSet,LinkedHashSet...
import java.util.*;
public class Jtc4 {
     public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(new Integer(99));
		System.out.println(hs.add("som"));
		hs.add("som@jtc");
		System.out.println(hs.add("som"));
		System.out.println(hs);
		TreeSet ts =new TreeSet();
//		ts.add(new Integer(99));
		System.out.println(ts.add("som"));
		ts.add("aaaa");
		ts.add("cccc");
		ts.add("bbbb");
		System.out.println(ts);
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(new Integer(99));
		System.out.println(lhs.add("som"));
		lhs.add("som@jtc");
		System.out.println(lhs.add("som"));
		System.out.println(lhs);
		
		
	}
}

package com.jtc.CollectionWorkbook;
// example using ListInterface
import java.util.*;
public class Jtc2 {
	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add(new Integer(99));
		al.add("som");
		al.add("123");
		al.add("som@jtc");
		al.add("som");
		System.out.println(al);
		al.add(0,"aaaa");
		al.add(2,"bbbb");
		System.out.println(al);
		al.remove(4);
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.indexOf("som"));
		System.out.println(al.lastIndexOf("som"));
		al.set(0, "jtc");
		System.out.println(al);
		List list = al.subList(1, 4);
		System.out.println(list);
		System.out.println("forword order");
		ListIterator li =al.listIterator();
		while (li.hasNext()) {
			Object o =  li.next();
			System.out.println(o);
			
		}
		System.out.println("reverse order");
	    while (li.hasPrevious()) {
		Object object = (Object) li.previous();
		System.out.println(object);
		
	}
		
		
	}
	

}

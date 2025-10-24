package com.jtc.CollectionWorkbook;
// Example using Vector and LinkedList....
import java.util.*;
public class Jtc3 {
	public static void main(String[] args) {
		Vector v =new Vector();
		v.add("99");
		v.add("som");
		v.addElement("som@jtc");
		v.addElement("som");
		System.out.println(v);
		System.out.println("forword order");
		Enumeration en =v.elements();
		while (en.hasMoreElements()) {
			Object o = en.nextElement();
			System.out.println(o);
		}
		Iterator it =v.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
		}
		LinkedList ll = new LinkedList();
		ll.addFirst("11");	
		ll.addLast("22");
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		}
	

}

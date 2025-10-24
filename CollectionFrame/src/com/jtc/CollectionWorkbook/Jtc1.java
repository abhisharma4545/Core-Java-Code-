package com.jtc.CollectionWorkbook;
import java.lang.reflect.Array;
// example using Collection
import java.util.*;
public class Jtc1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		al.add(new Integer(99));
		al.add("som");
		al.add("som@JTC");
		al.add(123);
		al.add(new Long(1111));
		al.add(new Double(999.99));
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		Object [] obj = al.toArray();
		System.out.println(obj.length);
		System.out.println("printing directly");
		for(int i=0;i<obj.length;i++) {
			System.out.println(obj[i]);
			}
		System.out.println("checking aand casting");
		for(int i=0;i<obj.length;i++) {
			Object o=obj[i];
			if(o instanceof String) {
				String str = (String)o;
				System.out.println("String\t"+str);
				
			}else if(o instanceof Integer){
				Integer in  =(Integer)o;
				System.out.println("Integer\t"+in);
				
			}else if(o instanceof Double) {
				Double d= (Double)o;
				System.out.println("Double\t"+d);
			}
		}
		Iterator it = al.iterator();
		while (it.hasNext()) {
			Object o =  it.next();
			System.out.println(o);
			
		}
		System.out.println(al.contains("som"));
		System.out.println(al.contains("jtc"));
		System.out.println(al);
		al.add("123");
		System.out.println(al);
		al.remove("123");
		System.out.println(al);
		
		ArrayList al1 = new ArrayList();
		al1.add("aa");
		al1.add("bb");
		al1.add("cc");
		al1.add("dd");
		System.out.println(al1);
		System.out.println(al);
		System.out.println(al.size());
//		al.add(al1);
		al.addAll(al1);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.containsAll(al1));
		System.out.println(al);
		
//		  al.removeAll(al1);
//		  System.out.println(al);
		
		/*retainAll() method is used to
	   keep only the elements that are 
	    present in both collections*/
		al.retainAll(al1);
		System.out.println(al);
		al.clear();
		System.out.println(al);
	}

}

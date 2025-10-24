package com.jtc.Comptcle;

import java.util.HashMap;
import java.util.*;
class Hello1{
	
}

public class Jtc33 {
	public static void main(String[] args) {
//		TreeSet s = new TreeSet();
//		here it is not allowed to add hello type object in TreeSet bcz class hello is not sub type of Compareble Interface.... 
//		s.add(new Hello1());
		HashMap n = new HashMap();
		n.put("name", "som");
		n.put("sid",101);
		n.put("email", "som@gmail.com");
		n.put(2343, 3535453);
		n.put(null, null);
		System.out.println(n);
		System.out.println(n.size());
		System.out.println(n.isEmpty());
		
		System.out.println(n.get("sid"));
		System.out.println(n.get("email"));
		System.out.println(n.containsKey("name"));
		System.out.println(n.containsValue("stu"));
		System.out.println(n.containsValue("som@gmail.com"));
		System.out.println(n.remove(2343));
		System.out.println(n);
		
		System.out.println("********************/n");
		n.replace("email", "jtc@jtcindia");
		System.out.println(n);
		System.out.println("----------------------\n");
	    Set myset= n.keySet();
	    System.out.println(myset);
	    for (Object obj : myset) {
	    	System.out.println(obj);
			
		}
	    Collection col = n.values();
	    System.out.println(col);
	    for (Object obj : col) {
	    	System.out.println(obj);
			
		}
	    
	    System.out.println("----------Pairs(Key-Value)------\n");
	    for (Object obj : myset) {
	    	 Object value =n.get(obj);
	    	 System.out.println(obj+" "+value);
			
		}
	    System.out.println("---------Using entrySet method and entry and map interface---------");
	    Set set = n.entrySet();
	    for (Object obj: set) {
	    	Map.Entry  m =(Map.Entry)obj;
	    	Object key =m.getKey();
	    	Object value=m.getValue();
	    	System.out.println(key+"  "+value);
	    	
			
		}
	     
		
		
		
	}

}

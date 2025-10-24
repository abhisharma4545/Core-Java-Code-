package com.jtc.Comptcle;

import java.util.*;
class Hello{
	
}

public class Jtc12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
         v.addElement("Jtc students");
         v.addElement(123);
         v.addElement(new Hello());
         v.addElement(123);
         System.out.println(v);
         Enumeration enm =v.elements();
         while (enm.hasMoreElements()) {
			Object object = (Object) enm.nextElement();
			System.out.println(object);
		}
         Properties p = new Properties();
//         no duplicity in key.......
         p.put("name", "email");
         p.put("abhi", "Abhi@gmail.com");
         Enumeration enm1 = p.propertyNames();
         while(enm1.hasMoreElements()) {
//        	 fetching value in form of Key and Value pairs...
        	 Object pname = enm1.nextElement();
        	 Object pvalue =p.get(pname);
        	 System.out.println(pname +" = "+pvalue);
        	 
         }
         
	}

}

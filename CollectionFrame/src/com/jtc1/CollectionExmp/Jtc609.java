package com.jtc1.CollectionExmp;
import java.util.*;

public class Jtc609 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v= new Vector();
		v.addElement("som");
		v.addElement("vivek");
		v.addElement("Abhishek");
      	System.out.println(v);
      Enumeration enm = v.elements();
      while(enm.hasMoreElements()) {
    	  Object obj =enm.nextElement();
    	  System.out.println(obj);
      }
	}

}

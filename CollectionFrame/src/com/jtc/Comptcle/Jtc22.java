package com.jtc.Comptcle;
import java.util.*;
public class Jtc22 {
       public static void main(String[] args) {
    	   List ltsr = new ArrayList();
    	   ltsr.add("AA");
    	   ltsr.add("bb");
    	   ltsr.add("jj");
    	   ltsr.add("kk");
    	   
    	   System.out.println(ltsr);
    	   System.out.println("Using ListIterator");
    	   ListIterator l1 =ltsr.listIterator();
    	       while(l1.hasNext()) {
    		   System.out.println(l1.next());
//    		   l1.remove();
    		   l1.set("Hello");
//    		   bcz it throws java.util.ConcurrentModificationException
//    		   here we can solve by using l1 in place of ltsr reference variable
//    		   ltsr.add("test");
    	   }
		
	}
}

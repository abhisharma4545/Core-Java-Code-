package com.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class q1 {
	public static void main(String[] args) {
		
		   List<Integer> li  =Arrays.asList(1,2,2,3,4,3);
		   Set<Integer> s = new HashSet<Integer>();
		     li.stream().filter(x->!(s.add(x))).forEach(x->System.out.print(x+" "));
		   
		   
		   
//		   List<Integer> s1 = new ArrayList<Integer>();
//		    Set<Integer> s = new HashSet<Integer>();
//		     for(int i=0;i<n.length;i++) {
//		    	 if(s.add(n[i])) {
//		    		 
//		    	 }else {
//		    		 s1.add(i);	 
//		    	 }
//		    	 
//		     }
//		     System.out.println(s1);
		   
		   
	}

}

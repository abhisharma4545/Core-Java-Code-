package com.Array;

import java.util.*;

// find duplicate in the Array....
public class A1 {
	public static void main(String[] args) {
		
	
	// brotu force approach
	
	int [] n = {2,3,1,2,3};
	
	   Arrays.sort(n);
	   Set<Integer>  wd = new HashSet<Integer>();
	   Set<Integer> withd = new HashSet<Integer>();
	   
	  for ( int v: n) {
		  if(!wd.add(v)) {
			  withd.add(v);
		  }
		  
		
	}
	  System.out.println(withd);
	  System.out.println(wd);
	   
}
}

package com.String;

import java.util.ArrayList;
import java.util.List;

// to find index of number which can be remove to make both string eqauls.....
public class q2 {
	public static void main(String[] args) {
		
		String s1= "abggba";
		char [] c1 = s1.trim().toCharArray();
		String s2 = "abgggba";
		char [] c2 = s2.trim().toCharArray();
		
		   List<Integer> li = new ArrayList<Integer>();
		 
		for(int i=0;i<c1.length;i++) {
			  for(int j=0;j<c2.length;j++) {
				  if(c1[i] == c2[j]) {
					  li.add(j);
					  
				  }
			  }
			
		}
		System.out.println(li);
	}

}

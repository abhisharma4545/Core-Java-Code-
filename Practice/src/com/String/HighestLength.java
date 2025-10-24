package com.String;

import java.util.Arrays;
import java.util.Comparator;

public class HighestLength {
	
	public static void main(String[] args) {
		    
		  // String str = "Java is a programming Langauge";
		   // Using Java 8 highest length of element in string
		// String hl =   Arrays.stream(str.split("\\s+")).max(Comparator.comparing(String::length)).get();
		// System.out.println(hl);
		 // to count number of word in string 
		 
		//long n =  Arrays.stream(str.split("\\s+")).count();
		//System.out.println(n);
		
		// to find number of vowels and consonents in String. using a java 8.. 
		
		   String s2 = "Program";
		   
		   long vowelsCounts = s2.toLowerCase().chars().filter(ch->"aieou".indexOf(ch) != -1).count();
		   long ConsonentCount= s2.toLowerCase().chars().filter(ch->Character.isLetter(ch) && "aieou".indexOf(ch) == -1).distinct().count();
		   System.out.println(vowelsCounts+"\t"+ConsonentCount);

		   
		   
		   
		   
		   
		
		
	}

}

package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Flatten {

	 public static void main(String[] args) {
//		map
		 
//		 List<Integer> li = Arrays.asList(1,2,3,4,5,6);
//		List<Integer> loi = li.stream().map(n->n+10).collect(Collectors.toList());
//		    System.out.println(loi);
//		    
//		    //FlatMap
//		    
//		    List<Integer>  l1 =Arrays.asList(1,2);
//		    List<Integer>  l2 =Arrays.asList(3,4);
//		    List<Integer>  l3 =Arrays.asList(5,6);
//		    
//		    List<List<Integer>> finalList = Arrays.asList(l1,l2,l3);
//		    
//		  List<Integer> lf =  finalList.stream().flatMap(x->x.stream()).collect(Collectors.toList());
//		    System.out.println(lf);
//		 List<Integer> lm=  finalList.stream().flatMap(x->x.stream().map(n->n+10)).collect(Collectors.toList());
//		    System.out.println(lm);
//		    
		    List<String> team1 = Arrays.asList("Scoot","David","John");
		    List<String> team2 = Arrays.asList("Mary","luna","tom");
		    List<String> team3 = Arrays.asList("Ken","Johny","Kitty");
		    
		    List<List<String>> playersInWorldcup = new  ArrayList<List<String>>();
		    playersInWorldcup.add(team1);
		    playersInWorldcup.add(team2);
		    playersInWorldcup.add(team3);
		    
		    // before java8
		    List<String> los0 = new ArrayList<String>();
		    for(List<String> team:playersInWorldcup) {
		    	for(String name:team) {
		    		
		    		los0.add(name);
		    		
		    		
		    	}
		    }
		    System.out.println(los0);
		    
		     //after java 8
		    
		 List<String> los =    playersInWorldcup.stream().flatMap(n->n.stream()).collect(Collectors.toList());
		    
		 System.out.println(los);
		    
		 
	}
}

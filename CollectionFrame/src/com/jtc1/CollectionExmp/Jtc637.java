package com.jtc1.CollectionExmp;
import java.util.*;
public class Jtc637 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet numSet = new TreeSet();
		numSet.add(50);
		numSet.add(20);
		numSet.add(10);
		numSet.add(80);
		numSet.add(60);
		numSet.add(70);
		numSet.add(30);
		numSet.add(40);
		System.out.println(numSet);
		 Set myset1 = numSet.descendingSet();
		 System.out.println(myset1);
		 System.out.println("--------------");
		 Iterator it =myset1.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		 System.out.println("------------");
		 Iterator it2 = numSet.descendingIterator();
		 while(it2.hasNext()) {
			 System.out.println(it2.next());
		 }
		 

	}

}

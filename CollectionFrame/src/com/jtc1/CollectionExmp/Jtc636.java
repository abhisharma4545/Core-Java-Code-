package com.jtc1.CollectionExmp;
import java.util.*;

public class Jtc636 {

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
		Set myset1=numSet.subSet(20, 60);
		System.out.println(myset1);
		Set myset2 = numSet.subSet(20,true,60,false);
		System.out.println(myset2);
		Set myset3 = numSet.subSet(20,true,60,true);
		System.out.println(myset3);
		Set myset4 = numSet.headSet(50);
		System.out.println(myset4);
		Set myset5 = numSet.headSet(50,true);
		System.out.println(myset5);
		Set myset6 = numSet.tailSet(50);
		System.out.println(myset6);
		Set myset7 = numSet.tailSet(50,false);
		System.out.println(myset7);
		
		

	}

}

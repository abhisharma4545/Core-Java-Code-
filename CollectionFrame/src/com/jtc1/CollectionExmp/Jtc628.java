package com.jtc1.CollectionExmp;
import java.util.*;

public class Jtc628 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List courselist =new ArrayList();
		courselist.add("Java");
		courselist.add("Spring");
		courselist.add("Angular");
		courselist.add("Spring");
		courselist.add("react");
		courselist.add("Php");
		System.out.println(courselist);
		System.out.println("-----------------");
		ListIterator lit = courselist.listIterator();
		while(lit.hasNext()) {
			String element =lit.next().toString();
			int index = lit.nextIndex();
			System.out.println(index+"\t"+element);
		}
		System.out.println("-------------------");
		lit = courselist.listIterator(courselist.size());
		while(lit.hasPrevious()) {
			String element = lit.previous().toString();
			int index = lit.previousIndex();
			System.out.println(index+"\t"+element);
		}
		System.out.println("------------------");
		System.out.println(courselist.indexOf("Java"));
		
		

	}

}

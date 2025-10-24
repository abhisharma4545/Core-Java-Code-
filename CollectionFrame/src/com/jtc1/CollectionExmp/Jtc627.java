package com.jtc1.CollectionExmp;
import java.util.*;

public class Jtc627 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List courselist = new ArrayList();
		courselist.add("Java");
		courselist.add("Spring");
		courselist.add("Angular");
		courselist.add("Spring");
		courselist.add("react");
		courselist.add("Php");
		System.out.println(courselist);
		ListIterator lit =courselist.listIterator();
		while (lit.hasNext()) {
			  String str = lit.next().toString();
			  if(str.equals("Spring")) {
				  lit.set("Spring 5");
			  }
	
		}
		System.out.println(courselist);
		lit=courselist.listIterator();
		while (lit.hasNext()) {
			String str = lit.next().toString();
			if(str.equals("Angular")) {
			lit.remove();
			break;
			}
			
		}
		System.out.println(courselist);
	}

}

package com.jtc.p2;

import java.lang.reflect.Modifier;

import java.lang.reflect.Field;

class A{
	int a =101;
	void mA() {
		System.out.println("mA in A");
	}
}
class B extends A{
	public final static int b1 =909;
	 final static int c1 = 808;
	
	 B() {
		System.out.println("B() in B");
	}
	 void mB() {
		 System.out.println("mB in B");
		 System.out.println(b1);
	 }
	 void mb1(int a,int b) {
		 System.out.println("Mb1 in B");
		 
	 }
		 
	 }

public class Jtc2 {

	public static void main(String[] args) {
		try {
		 Class cls=Class.forName("com.jtc.p2.B");
		 B b1 =(B)cls.newInstance();
		 System.out.println(Modifier.PUBLIC);
		 System.out.println(Modifier.PRIVATE);
		 System.out.println(Modifier.FINAL);
		 System.out.println("Fields************\n");
		  Field f[]= cls.getFields();
		    for(int i=0;i<f.length;i++) {
			System.out.println(f[i].getModifiers()+"type\t"+f[i].getType()+"name\t"+f[i].getName());
		    }
		    System.out.println("DeclaredFields***********\n");
		    Field f1[]=cls.getDeclaredFields();
		    for(int i=0;i<f.length;i++) {
				System.out.println(f1[i].getModifiers()+"type\t"+f[i].getType()+"name\t"+f[i].getName());
			    }
		    
		    
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		}

	}



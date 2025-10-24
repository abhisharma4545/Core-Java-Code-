package com.jtc.Test5question;

class PD{
	 int id;
	 String name;
	 String bg;
	 PD(int id, String name, String bg){
	  this.id = id;
	  this.name = name;
	  this.bg = bg;
	 }
	 void show(){
	  System.out.println("Personal Details"); 
	  System.out.println("id :- "+id);
	  System.out.println("name :- "+name); 
	  System.out.println("blood group :- "+bg);
	 } 
	} 
	class Address extends PD{ 
	String city; 
	String state;
	long pin; 
	 Address(int id,String name,String bg,String city, String state, long pin){
		 super(id,name ,bg);
		  this.city = city;
	      this.state = state;
	      this.pin = pin;
	 } 
	void show(){
		super.show();
	 System.out.println("Address Details");
	 System.out.println("city :- "+city);
	 System.out.println("state :- "+state);
	 System.out.println("pin :- "+pin);
	 } }
	 class Student extends Address{
	  String course; 
	  String doe; 
	   Student(int id,String name,String bg,String city, String state, long pin,String course, String doe){ 
	    super(id, name, bg, city, state, pin);
		   this.course = course; 
	    
	    this.doe = doe; 
	}
	 void show(){
      super.show();
	 System.out.println("Student Details"); 
	 System.out.println("course :- "+course); 
	 System.out.println("doe :- "+doe); 
	} 
	} 
	public class JTC{
	 public static void main(String arg[]){ 
//	 PD p1 = new PD(101,"Arjun","O+");
//	 p1.show();
//	 Address a1 = new Address(101,"Arjun","o+","Noida","UP",201301); 
//	 a1.show();
	 Student s1 = new Student(101,"Arjun","O+","Noida","UP",201301,"Java Full Stack","12 Feb 2021"); 
	 s1.show(); 
	}
	 }

package com.jtc.OopsWorkbook;
// Example using Abstract class.....
public class Jtc18 {
      public static void main(String[] args) {
		// TODO Auto-generated method stub
    	  System.out.println(Person.minAgeToVote);
    	  Person per = null;
//    	  per = new Person();
//    	  per.showWorkInfo();
//    	  System.out.println(per.name);
    	  per = new Employee("SomPrakash",123444444L);
    	  per.showWorkInfo();
    	  System.out.println(per.name+"\t"+per.phone);
    	  per = new OldStudent();
    	  per.showWorkInfo();
    	  per = new CurrentStudnet();
    	  per.showWorkInfo();
    	  System.out.println("\n***************");
    	  Person p = null;
    	  p = PersonService.getInstance("Employee");
    	  System.out.println(p.getPersonType());
    	  p = PersonService.getInstance("CurrentStudent");
    	  System.out.println(p.getPersonType());
    	  

	}

}
abstract class Person{
	static int minAgeToVote = 18;
	String name;
	long phone;
	 Person(String name,long phone) {
		// TODO Auto-generated constructor stub
		 this.name=name;
		 this.phone=phone;
		 System.out.println("--Person(String,long)Cons..\t"+this);
	}
	 Person(){
		 System.out.println("---Person() Cons..\t:"+this);
	 }
	 {
		 System.out.println("\n***Person Instance block**");
	 }
	 abstract void showWorkInfo();
	 abstract String getPersonType();
	 void show() {
//		 Person p=new Person();
//		 p.showWorkInfo();
	 }
}
//class Farmer extends Person{}
class Employee extends Person{
	Employee(String name,long phone) {
		// TODO Auto-generated constructor stub
		super(name,phone);
	}
	Employee(){
		
	}
		String getPersonType() {
			return "Employee";
		}
	void showWorkInfo() {
		System.out.println("--Employee Working in company--");
	}
}
abstract class Student extends Person{}
class CurrentStudnet extends Student{
	void showWorkInfo() {
		System.out.println("Attending the class--");
	}
	String getPersonType() {
		return "CurrentStudent";
	}
}
class OldStudent extends Student{
	void showWorkInfo() {
		System.out.println("--Searching for Job--");
	}
	String getPersonType() {
		return "OldStudent";
	}
	
}
 class PersonService{
	 static Person getInstance(String cName) {
		 if(cName.equals("Employee")) {
			 return new Employee();
		 }
		 else if(cName.equals("CurrentStudent")){
			 return new CurrentStudnet();
		 }
		 else {
			 return null;
		 }
	 }
 }
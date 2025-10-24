package com.jtc.LQ5;

public class Jtc5 {
   public static void main(String[] args) {
	   Address add = new Address(101, "c-29 Sector-2 Noida", "Noida", 201301);
	   Student  stud = new Student(99, "SomPrakash", 6526668, add);
	   System.out.println(stud);
	   System.out.println("--Modifying the add ref in Main--");
//	   stud.stuAdd.aid = 1234;
	   add.aid = 14523;
	   System.out.println(add);
	   add.street = "Sector 12 Noida";
	   System.out.println(stud);
	   System.out.println(stud.getSid());
	   Address ref = stud.getStudAddress();
	   ref.aid = 111111;
//	   ref.city="sdhsfgd";
	   System.out.println(stud);
	
}
}
final class Student{
	private final int sid;
	private final String name;
	private final long phone;
	private  Address stuAdd;
	  public Student(int sid,String name,long phone,Address stuAdd){
		  this.sid=sid;
		  this.name=name;
		  this.phone=phone;
		  this.stuAdd=new Address(stuAdd.aid, stuAdd.street, stuAdd.city, stuAdd.pin);
		 }
	  @Override
	public String toString() {
		// TODO Auto-generated method stub
		 return "Stud Info\t:"+sid+"\t"+name+"\t"+phone+ "\nAdd Info\t:"+stuAdd;
	}
	  public int getSid() {
		  return this.sid;
	  }
	  public Address getStudAddress() {
		  return (Address)stuAdd.clone();
		
	}
	
	
}
class Address{
	int aid;
	String street;
	String city;
	int pin;
	public Address(int aid,String street,String city,int pin){
		this.aid=aid;
		this.street=street;
		this.city=city;
		this.pin=pin;
	}
	 public Object clone() {
		 return new Address(this.aid, this.street, this.city, this.pin);
	 }
	
	public String toString() {
		return aid +"\t"+street+"\t"+city+"\t"+pin;
	}
	}


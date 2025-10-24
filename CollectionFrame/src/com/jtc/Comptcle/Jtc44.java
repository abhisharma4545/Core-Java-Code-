package com.jtc.Comptcle;
import java.util.*;
class Customer{
	int cid;
	 String cname;
	 String email;
	 long phone;
	 public Customer(int cid, String cname, String email, long phone) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + ", phone=" + phone + "]";
	}
	 
	String show() {
		System.out.println("show in Customer");
		return toString();
	}

	
	
}

public class Jtc44 {
	public static void main(String[] args) {
		
		ArrayList<Customer> al = new ArrayList<Customer>();
		al.add(new Customer(101,"som","som@gmail",21312));
		al.add(new Customer(102,"Abhi","Abhi@gmail.com",1231231));
		al.add(new Customer(103, "amit", "amit@gmaail", 1221212));
		
		System.out.println(al);
		Iterator<Customer> it =al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	

}

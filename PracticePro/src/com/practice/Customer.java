package com.practice;

public class Customer {
	
	
	private int cid;
	private String cname;
	private double salary;
	
	public Customer(int cid, String cname, double salary) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.salary = salary;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", salary=" + salary + "]";
	}
	
	
     
}

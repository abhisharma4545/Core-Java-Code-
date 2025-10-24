package com.java8.quesUponStreamapi;

public class Student {
	
	private int sid;
	String name;
	private long phone;
	private String courseName;
	private double feePaid;
	private double  feeBal;
	public Student(int sid,String name,long phone , String courseName,double feePaid, double feeBal) {
		super();
		this.sid = sid;
		this.name=name;
		this.phone = phone;
		this.courseName = courseName;
		this.feePaid = feePaid;
		this.feeBal = feeBal;
		
	}
	
	
	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getPhone() {
		return phone;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public double getFeePaid() {
		return feePaid;
	}


	public void setFeePaid(double feePaid) {
		this.feePaid = feePaid;
	}


	public double getFeeBal() {
		return feeBal;
	}


	public void setFeeBal(double feeBal) {
		this.feeBal = feeBal;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", phone=" + phone + ", courseName=" + courseName
				+ ", feePaid=" + feePaid + ", feeBal=" + feeBal + "]";
	}



	
	

}

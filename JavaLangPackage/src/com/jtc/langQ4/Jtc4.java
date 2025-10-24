package com.jtc.langQ4;
import java.sql.*;

public class Jtc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--IN Main--");
		new Student(99);
		Student st = new Student(88);
		st.finalize();
		System.out.println("Value of sid\t:"+st.sid);
		st = null;
		Student st1 = new Student(77);
		st1 = new Student(66);
		Student st2 = new Student(55);
		Student st3 = new Student(44);
		st2 = st3;
		System.gc();
		show();
		for(int i=0;i<5;i++) {
			System.out.println("I value\t:"+i);
		}
		Student st99= new  Student(33);
		System.gc();
	   System.out.println("--Main Completed--");
	}
	static void show() {
		Student stu1 = new Student(101);
		Student stu2 = new Student(202);
//		Statements
		
	}

}
final class Student{
	int sid;
	private Connection con = null;
	public Student(int sid) {
		// TODO Auto-generated constructor stub
		this.sid=sid;
//		code to Connect With DB
		System.out.println("--Connected with Resource--\t:"+sid);
	}
	void addInfo() {
//		Using the con to interact with DB
	}
	void deleteInfo() {
//		Using the con to intract with DB
	}
	@Override
	 public void finalize() {
		// Code to close the DB Connection
		System.out.println("**Resource is RELEASED**\t"+sid);
		
		
	}
}

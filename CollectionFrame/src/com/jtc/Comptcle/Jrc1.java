package com.jtc.Comptcle;
 import java.util.ArrayList;
import java.util.Comparator;

class Student implements Comparable<Student>{
	int sid;
	String name;
	String email;
	String phone;
	
	
	public Student(int sid, String name, String email, String phone) {
		super();
		this.sid = sid;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	


	@Override
	public String toString() {
		return  "Student [sid=" + sid + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}



	public int compareTo(Student o) {
//		 write your own implementations.....\
		return this.sid-o.sid;
		
	}
}
class SidComparator implements Comparator<Student>{
	@Override
	public int compare(Student stu1, Student stu2) {
		return stu1.sid-stu2.sid;
	}

	}  
class emailComprator implements Comparator<Student>{
	@Override
	public int compare(Student stu1, Student stu2) {
		// TODO Auto-generated method stub
		int x =stu1.email.compareTo(stu2.email);
		return x;
	}
	
}
public class Jrc1 {
      public static void main(String[] args) {
		// TODO Auto-generated method stub
    	  Student s1 = new Student(01, "Amit", "amit@gmail.com", "123455");
          Student s2 = new Student(02,  "Abhishek", "abhi@gmail.com", "1232211");
          Student s3 = new Student(03, "Ravi", "r@gmail.com", "12322233");
          Student s4 = new Student(04, "Saurabh", "sau@gmail.com", "676767");
          ArrayList<Student> t1 = new ArrayList<Student>();
          t1.add(s1);
          t1.add(s2);
          t1.add(s3);
          t1.add(s4);
          
	}

}

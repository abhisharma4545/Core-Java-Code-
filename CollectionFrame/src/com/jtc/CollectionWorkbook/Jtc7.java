package com.jtc.CollectionWorkbook;
import java.util.*;
// Example using Comparator and Comparaable  interface.....
class Student implements Comparable{
	int sid;
	String sname;
	String email;
	public Student(int sid, String sname, String email) {
//		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
	}
	@Override
	public String toString() {
		return  ""+sid+"\t"+sname+"\t"+email;
		}
	
	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		Student s=(Student)o;
		if(this.sid==s.sid) {
			return true;
		}else {
			return false;
		}
		
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student s=(Student)o;
		return this.sid-s.sid;
	}
	
	
	}
class SnameComparator implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Student s1=(Student)o1;
		Student s2 =(Student)o2;
		return s1.sname.compareTo(s2.sname);
	}
}
class emailComparator implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Student s1=(Student)o1;
		Student s2 =(Student)o2;
		return s1.email.compareTo(s2.email);
	}
}
public class Jtc7 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		Student s1 =new Student(22, "dd", "cc@jtc");
		Student s2 =new Student(44, "aa", "bb@jtc");
		Student s3 =new Student(11, "cc", "aa@jtc");
		Student s4 =new Student(33, "bb", "bb@jtc");
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		System.out.println(al);
		System.out.println("No Sorting");
		Iterator it =al.iterator();
		while (it.hasNext()) {
			Student s= (Student) it.next();
			System.out.println(s);
			
		}
		System.out.println("Sorting by Sid");
		Collections.sort(al);
		it = al.iterator();
		while (it.hasNext()) {
			Student  s = (Student ) it.next();
			System.out.println(s);
			
		}
		System.out.println("sorting by Sname");
		Collections.sort(al,new SnameComparator());
		it =al.iterator();
		while (it.hasNext()) {
			Student  s = (Student) it.next();
			System.out.println(s);
			
		}
		System.out.println("Sorting by Email");
		Collections.sort(al,new emailComparator());
		it=al.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s);
			
		}
		
		
		
	}

}

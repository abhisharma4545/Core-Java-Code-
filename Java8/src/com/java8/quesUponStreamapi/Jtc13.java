package com.java8.quesUponStreamapi;
//what is the total Fee Bal to Recieve....
// what is the Total Fee Paid till now 
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Jtc13 {
	public static void main(String[] args) {
		List<Student> l1 = DataUtil.getStudentList();
		double totalFeeBal = l1.stream().collect(Collectors.summingDouble(Student::getFeeBal));
		System.out.println("Total Fee bal:"+totalFeeBal);
		
		double totalFeePaid = l1.stream().collect(Collectors.summingDouble(Student::getFeePaid));
		System.out.println("Total Fee Paid:"+totalFeePaid);
				
	}

}

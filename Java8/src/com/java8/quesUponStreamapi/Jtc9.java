package com.java8.quesUponStreamapi;
//  how many student has to pay the fee bal from Devops Cousre...
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
public class Jtc9 {
  public static void main(String[] args) {
	 List<Student> stulist  = DataUtil.getStudentList();
	 long count1=stulist.stream().filter(m->m.getCourseName().equals("Devops")).filter(m->m.getFeeBal()>0).collect(Collectors.counting());
	 
	 System.out.println(count1);
	 

	
}
}

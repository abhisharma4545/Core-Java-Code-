package com.java8.quesUponStreamapi;
import java.util.Iterator;
// Display student who has to pay the Bal and who Paid seperately
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Jtc12 {
 
	  public static void main(String[] args) {
		 List<Student> l1 = DataUtil.getStudentList();
		 Map<Boolean,List<Student>> stuMap = l1.stream().collect(Collectors.partitioningBy(m->m.getFeeBal()==0));
		 
		 for(Boolean flag:stuMap.keySet()) {
			 List<Student> myliList = stuMap.get(flag);
			 if(flag) {
				 System.out.println("student with no bal: ");
			 }else{
				 System.out.println("Student with Bal to pay:");
				 
			 }
			 myliList.forEach(System.out::println);
		 }
	}
	
}

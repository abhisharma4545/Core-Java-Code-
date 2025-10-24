package com.java8.quesUponStreamapi;
//which student has paid fee more (max)
// and which student has paid fee less (min)
import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;
public class Jtc10 {
	public static void main(String[] args) {
		List<Student> stulist = DataUtil.getStudentList();
		 Optional<Student> op1= stulist.stream().max((s1,s2)->(int)(s1.getFeePaid()-s2.getFeePaid()));
		 op1.ifPresent(System.out::println);
		 
		 System.out.println("-----------------------\n");
		  Optional<Student> op2 =stulist.stream().collect(Collectors.maxBy((a1,a2)->(int) (a1.getFeePaid()-a2.getFeePaid()))); 
		  op2.ifPresent(System.out::println);
		  
		  System.out.println("---------min Value-----------");
		  Optional<Student> op3= stulist.stream().min((s1,s2)->(int)(s1.getFeePaid()-s2.getFeePaid()));
			 op3.ifPresent(System.out::println);
			 
			 System.out.println("-----------------------\n");
			  Optional<Student> op4 =stulist.stream().collect(Collectors.minBy((a1,a2)->(int) (a1.getFeePaid()-a2.getFeePaid()))); 
			  op4.ifPresent(System.out::println);
			  
			  
//			  which student fee bal is more
			  Optional<Student> op5=stulist.stream().collect(Collectors.maxBy((a1,a2)->(int) (a1.getFeeBal()-a2.getFeeBal()))); 
			  op5.ifPresent(System.out::println);

	}

}

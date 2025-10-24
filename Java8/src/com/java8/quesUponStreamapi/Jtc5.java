package com.java8.quesUponStreamapi;
// Find the Student whose feebal>=12000,Add 1000 to all of them
//sort them in Decending order By Feebal Store the result  in ResultList
 import java.util.List;
 import java.util.stream.Collectors;
 
public class Jtc5 {
	public static void main(String[] args) {
		 List<Student> stulist = DataUtil.getStudentList();
		 stulist.stream().filter(m->m.getFeeBal()>=2000).forEach(System.out::println);
		 
		 System.out.println("------after Update------------");
		 stulist.stream().filter(m->m.getFeeBal()>=2000).map(m->{
			 m.setFeeBal(m.getFeeBal()+1000);
			 return m; }).forEach(System.out::println);
		 
		 
		    System.out.println("--------------------After sorted-------------");
		    stulist.stream().filter(m->m.getFeeBal()>=2000).map(m->{
				 m.setFeeBal(m.getFeeBal()+1000);
				 return m; }).sorted((s1,s2)->(int) (s2.getFeeBal()-s1.getFeeBal())).collect(Collectors.toList()).forEach(m->System.out.println(m));
	}
}

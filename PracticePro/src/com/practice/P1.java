package com.practice;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class P1 {
	
	public static void main(String[] args) {
		
               List<Integer> li = Arrays.asList(1,2,3,4,10,5,5,6,7,8,9,11,12,13,14,25,26,28);
	    
               List<String> ls = Arrays.asList("abhi","shubham","mitesh","nitish","abhinesh");
//		li.stream().sorted(Comparator.comparing(Integer::intValue))
//		forEach(System.out::println);
	    

//	   1. to sort list of String...
//	   
//	    ls.stream().sorted().forEach(System.out::println);
//	    
////	    2. find all even number using stream Api...
//	    
//	  li.stream().filter((x)->x%2==0).forEach(System.out::println);
               
            //  3. Convert a list of strings to uppercase using streams.
               
//               ls.stream().map(String::toUpperCase).forEach(System.out::println);
	  
               
//               4. Count the number of strings that start with a specific letter
//               long a=ls.stream().filter(x->x.startsWith("a")).count();
//               System.out.println(a);
                 
               
//               5.Find the maximum and minimum number from a list.
               
//             Optional<Integer> op1= li.stream().max(Comparator.naturalOrder());
//               System.out.println(op1.get());
//               
//               Optional<Integer> op2= li.stream().min(Comparator.naturalOrder());
//               System.out.println(op2.get());
               
               
               
//        6. Remove duplicate elements from a list.
               
//          Stream<Integer> withoutdulicate = li.stream().distinct();
//          withoutdulicate.forEach((x)->System.out.print(x+" "));
               
            
//               7.Filter names starting with a particular letter.
               
//         List<String>    astr  =  ls.stream().filter((x)->x.startsWith("a")).collect(Collectors.toList());
//             System.out.println(astr);
               
//               8.  Convert a list of integers to their squares
               
//            List<Integer> sli =   li.stream().map((x)->x*x).collect(Collectors.toList());
//                System.out.println(sli);
                
//              9.Join a list of strings with comma delimiter.
               
//        String result =   String.join("-", ls);
//        System.out.println(result);
               
//            String rs =  ls.stream().collect(Collectors.joining(","));
//            System.out.println(rs);
               
//                10. Print the first 5 even numbers from a list.
               
             //  li.stream().filter((x)->x%2==0).limit(5).forEach(System.out::println);
               
              // 11. Check if any number in the list is divisible by 5.
               
//            boolean bn=  li.stream().anyMatch((x)->x%5==0);
//           boolean  bn1= li.stream().filter((x)->x%5==0).findFirst().isPresent();
//            System.out.println(bn);
               
//             12. Collect odd numbers into a new list
               
//             List<Integer> ol=  li.stream().filter((x)->x%2 !=0).collect(Collectors.toList());
//               System.out.println(ol);
               
//               13.Find the average of a list of numbers.
//              1.way 
//           double average  =  li.stream().mapToInt(Integer::intValue).average().orElse(0.0);
//           
//           System.out.println(average);
               
//               2.
//             Double av = li.stream().collect(Collectors.averagingInt(Integer::intValue));
             
////               3. int sum = 0;
//               for (int num : list) {
//            	    sum += num;
//            	}
//            	double average = (double) sum / list.size();
//            	System.out.println("Average: " + average);

//               4.way
               
//             IntSummaryStatistics stats=  li.stream().mapToInt(Integer::intValue).summaryStatistics();
             
//             double av = stats.getAverage();
               
               
//               List<Student> l1 = DataUtil.getStudentList();
//               
//               l1.stream().filter((x)->x.getFeeBal()>=2000).forEach(System.out::println);
               
//             14.  Get a list of employee names whose salary is above 50,000.
               
//               List<Customer> lc = DataUtilOfCustomer.getCustList();
//            List<Customer> lmod = lc.stream().filter((x)->x.getSalary()>50000).collect(Collectors.toList());
//            System.out.println(lmod);
            
            //15. Sort a list of custom objects by field (e.g., age)
//             here we by name..
            
            //lc.stream().sorted(( o1, o2)->o1.getCname().compareTo(o2.getCname())).forEach(System.out::println);
//               lc.stream().sorted(Comparator.comparing(Customer::getCname)).forEach(System.out::println);
               
//                Flantted list in option class
               
//               In Java 8, flatMap() is a powerful method used primarily with Streams to flatten a Stream of collections into a single Stream.
//               It’s especially useful when dealing with nested structures like List<List<T>>,
//               Optional<Optional<T>>, etc.
        
               
//             <R>  Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)
//               
//                 List<List<String>> lol = Arrays.asList(Arrays.asList("Abhi","raj"),Arrays.asList("Vikki","neha"),Arrays.asList("Sana","Mikki"));
//               
//                List<String> flatlist =   lol.stream().flatMap(Collection::stream).collect(Collectors.toList());
//              System.out.println(flatlist);
//               
//               
//               List<Optional<String>> cl = Arrays.asList(Optional.ofNullable("ahi"));
//               
//           String  os = cl.stream().flatMap((input)->input.stream()).map(a->a.toUpperCase() ).findAny().get();
//           System.out.println(os);
//           
//        List<String>=  lol.stream().flatMap(x->x.stream().map(x->x.toUpperCase())).collect(Collectors.toList());
//               
               
//                use of partioningBy method
//               List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//
//               Map<Boolean, List<Integer>> partitioned = numbers.stream()
//                   .collect(Collectors.partitioningBy(n -> n % 2 == 0));
//               
//               System.out.println(partitioned); //   {false=[1, 3, 5], true=[2, 4, 6]}

            
            //   System.out.println(partitioned.get(true));  // [2, 4, 6]
            //   System.out.println(partitioned.get(false)); // [1, 3, 5]
               
               
               
               
//               ..Grouping Strings by Length
               
//               List<String> words = Arrays.asList("apple", "bat", "banana", "cat", "dog");
//
//               Map<Integer, List<String>> grouped = words.stream()
//                   .collect(Collectors.groupingBy(String::length));
//
//               System.out.println(grouped);// {3=[bat, cat, dog], 5=[apple], 6=[banana]}

               
               
               
               //Join With Delimiter, Prefix, and Suffix
             
//               List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
//
//               String result0 = names.stream()
//                                    .collect(Collectors.joining());
//
//               System.out.println(result0); // Output: AliceBobCharlie
//
//              String result1 = names.stream()
//               .collect(Collectors.joining(", ", "[", "]"));
//
//               System.out.println(result1); // Output: [Alice, Bob, Charlie]

               
               
//               toMap function...
               
//               List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
//
//               Map<String, Integer> nameLengthMap = names.stream()
//                   .collect(Collectors.toMap(
//                       name -> name,              // Key = name
//                       name -> name.length()      // Value = length of name
//                   ));
//
//               System.out.println(nameLengthMap);
//               // Output: {Alice=5, Bob=3, Charlie=7}

               
//                Handling Duplicate Keys
               
//               List<String> items = Arrays.asList("apple", "banana", "apple");
//
//               Map<String, Long> itemCount = items.stream()
//                   .collect(Collectors.toMap(
//                       item -> item, 
//                       item -> 1L, 
//                       Long::sum                     // merge function to handle duplicates
//                   ));
//
//               System.out.println(itemCount);
//               // Output: {banana=1, apple=2}
               
               Map<Integer,String> ms = new HashMap<Integer, String>();
               
                  ms.put(1, "bhi");
                  ms.put(3, "wi");
                  ms.put(6, "ch");
                  
              List<String> str  =   ms.values().stream().sorted(Comparator.comparing(String::valueOf)).collect(Collectors.toList());
                 System.out.println(str);
               
}
               

}

package Java.io.packagename;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileR {
	
	public static void main(String[] args) {
		int sum = 0;
		
		try( BufferedReader reader = new BufferedReader(new FileReader("ao.txt"))){
			String line;
			
			            
			         while((line = reader.readLine()) != null) {
			        	 
			        	 String [] numbers =line.trim().split("\\s+");
			        	 for (String string : numbers) {
			        		 
			        		 if(!string.isEmpty()) {
			        			 int num  = Integer.parseInt(string);
			        			 sum =sum+num;
			        		 }
			        		 	
						}
			        	 System.out.println(sum);
			        	 
			         }
			 
//			    Stream<String> str=reader.lines();
//			     List<String []> str1 = str.map(x->x.trim().split("\\s+")).collect(Collectors.toList());
//			      
//			     
//			     for(int i=0;i<str1.size();i++) {
//			    	 System.out.println(Arrays.toString(str1.get(i)));
//			     }
////			     for (String[] strings : str1) {
////			    	 System.out.println(Arrays.toString(strings));
////					
////				}
			      
			     
			   // System.out.println(str);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}

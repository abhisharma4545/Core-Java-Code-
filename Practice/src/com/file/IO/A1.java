package com.file.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A1 {
       public static void main(String[] args) throws IOException {
		         
    	   try {
    		   File file = new File("ao.txt");
    		   
    		   if(file.createNewFile()) {
    			   System.out.println(file.getName());
    			   
    			      			   
    		   }else {
    			   System.out.println("file alredy exist");
    			   FileWriter fw= new FileWriter(file);
     			  fw.write("1 2 3 4");
     			   fw.close();

    		   }
    		  // System.out.println(file.getAbsolutePath());
    		   
    		   
    	   }catch (Exception e) {
			// TODO: handle exception
		}
    	   try(BufferedReader reader = new BufferedReader(new FileReader("ao.txt"))){
    		     String line;
    		     if((line = reader.readLine()) !=null) {
    		    	 
    		    	 String [] str = line.trim().split("\\s+");
    		    	 int sum=0;
    		    	 int average =0;
    		    	 
    		    	 for(int i =0;i<str.length;i++) {
    		    		 
    		    		 int n= Integer.parseInt(str[i]);
    		    		 
    		    		 sum += n;
    		    		 
    		    		 
    		    	 }
    		    	 
    		    	 if(sum != 0) {
    		    	 average = sum/str.length;
    		    	 }
    		    	 
    		    	 System.out.println(sum+ " "+average);
    		     }
    	   }catch (IOException e) {
			// TODO: handle exception
    		   e.printStackTrace();
		}
    	   
	}
}

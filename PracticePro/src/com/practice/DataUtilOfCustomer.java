package com.practice;

import java.util.ArrayList;
import java.util.List;

public class DataUtilOfCustomer {
     static List<Customer> getCustList(){
    	 
    	 List<Customer> l1 = new ArrayList<Customer>();
    	 Customer c1 = new Customer(1, "Abhi", 60000);
    	 Customer c2 = new Customer(2, "Sumit",40000);
    	 Customer c3 = new Customer(3, "Mukesh",35000);
    	 Customer c4 = new Customer(2, "Sumit",55000);
    	 l1.add(c1);
    	 l1.add(c2);
    	 l1.add(c3);
    	 l1.add(c4);
    	 
    	 return  l1;
    	 
    	 
     }
}

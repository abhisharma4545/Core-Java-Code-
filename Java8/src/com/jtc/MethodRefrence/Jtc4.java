package com.jtc.MethodRefrence;

import java.util.Arrays;

@FunctionalInterface 
interface Hello{
	public void test(int [] arr);
}
public class Jtc4 {
	public static void main(String[] args) {
		int myarr1 []= {20,40,30,50,10};
		
		// Lamda experession 
		Hello hello1 = (arr)->{
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]>arr[j]){
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			
			
		};
		
		
	 hello1.test(myarr1);
		for(int x:myarr1) {
			System.out.println(x);
		}
		
		 Hello h = Arrays::sort;
		 h.test(myarr1);
		 for(int x:myarr1) {
			 System.out.println(x);
		 }
		 
	}

}

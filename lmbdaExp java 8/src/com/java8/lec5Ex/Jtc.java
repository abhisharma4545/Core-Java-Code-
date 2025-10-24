package com.java8.lec5Ex;
import java.util.*;
@FunctionalInterface
interface Hello{
	void test(int arr[]);
}

public class Jtc {
	public static void main(String[] args) {
		
		System.out.println("******Method Ref*****\n");
		int myArr[]= {33,44,55,2,3,12,33};
		Hello h1 = Arrays::sort;
		h1.test(myArr);
		for(int a:myArr) {
			System.out.println(a);
			
		}
		System.out.println("**Lambda Expression***");
		int arr1[]= {88,99,11,22,29,30};
		Hello h2 =(arr)->{
			for(int i=0;i<arr.length-1;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]>arr[j]) {
						int temp = arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		};
		h2.test(arr1);
		for(int b:arr1) {
			System.out.println(b);
			
		}
	}
}

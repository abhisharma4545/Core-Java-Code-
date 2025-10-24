package com.jtc.LogicalQA;

public class PrimeNum {
	public static void main(String[] args) {
		int num = 29;
		int count  = 0;
		for (int i=1;i<=num;i++) {
			if(num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Number is Prime");
			
		}else{
			System.out.println("num is not prime");
			
		}
	}

}

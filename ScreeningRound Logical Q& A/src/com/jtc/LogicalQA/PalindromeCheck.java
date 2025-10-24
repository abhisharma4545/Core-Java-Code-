package com.jtc.LogicalQA;

public class PalindromeCheck {
	public static void main(String[] args) {
		int num = 121;
		int temp;
		temp = num;
		int rem;
		int rev =0;
		while(temp>=1) {
			 rem = temp%10;
			 rev = rev*10+rem;
			 temp = temp/10;
			 
		}
		System.out.println(rev);
	}

}

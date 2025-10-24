package com.jtc.NormalQuestion;

//10. Sum of All Digits in a String
//Input: "a1b2c3"
//Output:6
public class SumAllDigit {
	public static void main(String[] args) {
		String input = "a1b2c3";
//		int sum  = input.chars().filter(Character::isDigit).map(c->Character.getNumericValue(c) ).sum();
		int sum = input.chars().filter(Character::isDigit).map(c->c - '0').sum();
		System.out.println("Sum of digit:-" + sum);
	}

}

//char ch = '5';
//int num = ch - '0';  // 5
//Characters like '0', '1', ..., '9' have ASCII values.
//
//'5' (ASCII 53) minus '0' (ASCII 48) gives 5

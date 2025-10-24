package com.jtc.Oops20Problem;

public class Square extends Shape {
        Square(double side) {
			// TODO Auto-generated constructor stub
        	 super(side);
		}
         double findArea() {
        	 System.out.println("***Square Find Area***");
        	 return length*length;
         }
         double getSide() {
        	 return length;
         }
         String getType() {
        	 return "Square";
         }
         static void display() {
        	 System.out.println("==Static Display in Square==");
         }
}

package com.java8.TimeAndDate;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;
public class Jtc1 {
 public static void main(String[] args) {
	 DayOfWeek monday = DayOfWeek.MONDAY;
	 System.out.println("Day\t"+ monday);
	 System.out.println("Day\t" +monday.getValue());
	 
	 Locale loc = Locale.getDefault();
	 System.err.println("Full\t"+ monday.getDisplayName(TextStyle.FULL, loc));
	 System.out.println("Short\t"+ monday.getDisplayName(TextStyle.SHORT, loc));
	 System.out.println("Narrow\t"+monday.getDisplayName(TextStyle.NARROW, loc));
	 System.out.println("---------------------\n");
	 
	 DayOfWeek sunday = DayOfWeek.SUNDAY;
	 
	 System.err.println("compareTo\t" +sunday.compareTo(monday));
	 System.out.println("compareTo\t"+monday.compareTo(sunday));
	 System.out.println("compareTo\t"+ sunday.compareTo(sunday));
	 System.out.println("---------------------\n");
	 
	 System.out.println("Day"+monday);
	 
	 System.out.println("-2"+monday.minus(2));
     System.out.println("+2"+monday.plus(2L));
	 

	 
}
}

package com.java8.Pdfbook;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Jtc {
public static void main(String[] args) {
Predicate<Integer> predicate1 = (num) ->{ System.out.println("Predicate 1");
return num % 2 == 0;
};
Predicate<Integer> predicate2 = (num) ->
{ System.out.println("Predicate 2");
return num % 2 != 0;
};
Predicate<Integer> predicate3 = (num) ->
{ System.out.println("Predicate 3");
return num >= 25 && num <= 50;
};
// Check whether Number is Even and between 25 and 50
boolean mybool = predicate1.test(28) &&(predicate3).test(78);
System.out.println(mybool);
mybool = predicate1.and(predicate3).test(19);
System.out.println(mybool);
// Check whether Number is Odd and between 25 and 50
mybool = predicate2.and(predicate3).test(29);
System.out.println(mybool);
mybool = predicate2.and(predicate3).test(19);
System.out.println(mybool);
// Check whether Number is Even or between 25 and 50
mybool = predicate1.or(predicate3).test(29);
System.out.println(mybool);
mybool = predicate1.or(predicate3).test(28);
System.out.println(mybool);
mybool = predicate1.and(predicate3).test(18);
System.out.println(mybool);
// Check whether Number is Odd or between 25 and 50
mybool = predicate2.or(predicate3).test(29);
System.out.println(mybool);
mybool = predicate2.or(predicate3).test(28);
System.out.println(mybool);
mybool = predicate2.and(predicate3).test(18);
System.out.println(mybool);
}
}
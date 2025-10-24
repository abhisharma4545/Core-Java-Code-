package com.jtc.Test7;
// Here the below program give output only 10 because of constant folding 
//  when 
abstract class A {
    static final  int a = 10;
    static {
        System.out.println("Static block in A");
    }
}

public class Jtc{
    public static void main(String[] args) {
        System.out.println(A.a);
    }
}

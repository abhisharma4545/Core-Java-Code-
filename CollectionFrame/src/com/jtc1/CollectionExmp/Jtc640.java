package com.jtc1.CollectionExmp;
import java.util.*;
 public class Jtc640{
public static void main(String as[]){
PriorityQueue pq1 = new PriorityQueue(); //1
pq1.offer(10);
pq1.offer(20);
pq1.offer(30);
pq1.offer(40);
pq1.offer(50);
pq1.offer(60);
pq1.offer(70);
pq1.offer(80);
pq1.offer(90);
System.out.println(pq1);
System.out.println(pq1.peek());
System.out.println(pq1.peek());
System.out.println(pq1);
System.out.println(pq1.poll());
System.out.println(pq1.poll());
System.out.println(pq1);
System.out.println(pq1.peek());
System.out.println(pq1.peek());
System.out.println(pq1.poll());
System.out.println(pq1.poll());
System.out.println(pq1);
}
}
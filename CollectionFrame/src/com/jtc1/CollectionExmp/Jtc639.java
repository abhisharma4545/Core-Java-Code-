package com.jtc1.CollectionExmp;
import java.util.*;
public class Jtc639 {
	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue();
		queue.add(50); 
		queue.add(20); 
		queue.add(10); 
		queue.add(40); 
		queue.add(30); 
		System.out.println(queue);
		System.out.println(queue.offer(21));
		System.out.println(queue.offer(99));
		System.out.println(queue.offer(88));
//        System.out.println(queue.offer("Ok"));
        System.out.println(queue);
        PriorityQueue pq1 =new PriorityQueue();
        pq1.offer(10);
        pq1.offer(20);
        pq1.offer(30);
        pq1.offer(40);
        pq1.offer(50);
//        pq1.offer(null);
        System.out.println(pq1);
	}

}

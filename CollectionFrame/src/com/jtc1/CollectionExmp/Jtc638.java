package com.jtc1.CollectionExmp;
import java.util.*;
class Jtc638{ 
public static void main(String as[]){ 
PriorityQueue queue = new PriorityQueue();
queue.add(50); 
queue.add(20); 
queue.add(10); 
queue.add(80); 
queue.add(60); 
queue.add(70); 
queue.add(30);
queue.add(40); 
System.out.println(queue);
System.out.println("----------------");
Iterator it=queue.iterator(); 
while(it.hasNext()){
System.out.println(it.next()); 
}
System.out.println("-------"); 
for(Object obj:queue){ 
System.out.println(obj); 
}
}
}

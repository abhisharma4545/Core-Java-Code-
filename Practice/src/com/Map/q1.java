package com.Map;

import java.util.Hashtable;
import java.util.Map;
// Map doest not follow the insertion or deletion methology
public class q1 {
	public static void main(String[] args) {
		
		String [] str = {"a","b","c","a"};
		int [] n = {1,2,1,1};
		Map<String, Integer> m=new Hashtable<String, Integer>();
		//for(int i=0;i<=str.length-1;i++) {
			 //  if(m.containsKey(str[i])){
				 //  int c= m.get(str[i]);
				//   m.put(str[i], c+n[i]);
				   
			 //  }else {
				 //  m.put(str[i], n[i]);
			//   }
	//	}
		 
//		System.out.println(m);
		//for(String key: m.keySet()) {
		//	System.out.println(key+"="+m.get(key));
		//}
		
		
		// 
		//m.merge(str[i], n[i], (oldVal, newVal) -> oldVal * newVal);

		
		for(int i=0; i<str.length;i++) {
		//	m.merge(str[i],n[i], (n2,n1)-> n2+n1);
			m.merge(str[i], n[i], Integer::sum);
			   
					   
		}
		
		System.out.print(m);
		
		
	}

}

package com.loop.Queastion;
// Prime number logic.................
public class Prime {

	public static void main(String[] args) {
		int i,j,count;
		for(i=1;i<=100;i++) {
			count=0;
			for(j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("PrimeNumber:-\t"+i);
			}
		}

	}

}

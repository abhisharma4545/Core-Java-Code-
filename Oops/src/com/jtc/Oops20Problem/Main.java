package com.jtc.Oops20Problem;

 class SecondLargestNumber{
	public static int findSecondLargest(int[] arr) {
		if( arr==null || arr.length <2) {
			throw new IllegalArgumentException(" Array must have at leat two elements");
		}
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int num:arr) {
			if(num>firstLargest) {
				secondLargest = firstLargest;
				firstLargest = num;
				
			}else if(num> secondLargest && num!= firstLargest) {
				secondLargest = num;
			}
			
		}
		return (secondLargest == Integer.MIN_VALUE)?-1:secondLargest;
	}
}
 public class Main {
    public static void main(String[] args) {
    	int[] arrs = {10,20,4,45,99,99,36};
    	int []arr1 = {1};
    	int secondLargest = SecondLargestNumber.findSecondLargest(arr1);
    	System.out.println("second largest Element:"+secondLargest);
        
        
    }
 }

	


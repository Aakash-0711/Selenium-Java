package com.java;

public class FindingMissingNumber {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,7};
		int sum=0;
		for(int i=0;i<=a.length-1;i++) {
			sum=sum+a[i];
			
		}

	System.out.println(sum);
	int sum1=0;
	for (int i = 1; i <=7; i++) {
		sum1=sum1+i;
		
	}
		System.out.println(sum1);
		System.out.println("missig num: " + (sum1-sum));
	}

}

package com.java;

public class Reverseinteger {

	public static void main(String[] args) {
		int n=1234;
		int rev = 0;
		while(n!=0) {
			rev=rev *10 + n % 10;
			n=n/10;
		}
		
		System.out.println(rev);
		
		int n1=5432;
		System.out.println(new StringBuilder(String.valueOf(n1)).reverse());
	}
	
	

}

package com.java;

public class Regularexpression {

	public static void main(String[] args) {
		String s="&&&&& Amazon 123 has 321 employee *()###";
		 s = s.replaceAll("[^ a-z A-Z 0-9]", "");
		System.out.println(s);
		

	}

}

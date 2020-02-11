package Week1.day2;

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {
		int a,b,c=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the numbers:");
		a=sc.nextInt();
		while(a>0)
		{
			b=a%10;
			c=c+b;
			a=a/10;
		}
		System.out.println("output:" + c);

	}

}

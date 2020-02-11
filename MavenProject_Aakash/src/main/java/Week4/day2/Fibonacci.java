package Week4.day2;

public class Fibonacci {

	public static void main(String[] args) {
		int  n=100, n1=0, n2=1;
		
		
		  for (int i = 0; n1 <= n; i++) {
		  
		  System.out.print(n1 + " "); 
		  int sum=n1+n2; 
		  n1=n2; 
		  n2=sum;
		  
		  
		  }
		 
		
		/*
		 * while (n1 <= n) { System.out.print(n1 + "  "); int sum = n1 + n2; n1 = n2; n2
		 * = sum;
		 * 
		 * }
		 */
	}

}

package week8.day1;

public class Palindromenumbers {
	
	public static void ispalindromenumber(int num) {
		int n=0;
		int sum=0;
		int temp=num;
		
		while(num > 0) {
			n=num % 10;
			sum= (sum*10) + n;
			num=num/10;
		}
		
		if(temp==sum) {
			System.out.println("palindrome num");
		}else
		{
			System.out.println("not palindrome num");
		}
	}
	
	
	

	public static void main(String[] args) {
		
         ispalindromenumber(151);
         ispalindromenumber(152);
         ispalindromenumber(0);
	}

}

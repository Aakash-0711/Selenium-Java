package week8.day1;

public class PalindromeString {
    
	public static void ispalindrome(String s) {
		System.out.println("Value: " + s);
		String rev="";
		int len = s.length();
		
		for (int i = len-1; i>=0; i--) {
			
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
		if(s.equals(rev)) {
			System.out.println("string rev palindrome");
		}
		else
		{
			System.out.println("revenot palindrome");
		}
		
	}
	
	public static void main(String[] args) {
		
ispalindrome("madam");
ispalindrome("ten");
ispalindrome("mam");
	}

}

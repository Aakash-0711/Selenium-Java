package Week4.day2;

public class Reverse {
	
	public static void main (String[] args)
	{
		String s="abcd";
		
		//char[] c = s.toCharArray();
		
		String r="";
		for (int i = s.length()-1; i >=0; i--) {
			
			r=r+s.charAt(i);
			
			
			
		}
		System.out.println(r);
		
	}
}



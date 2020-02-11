package Week1.day2;

public class Oddindextouppercase {

	public static void main(String[] args) {
		String s = "changeme";
		StringBuffer str= new StringBuffer();
		char[] cs = s.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			char c=cs[i];
			if(i %2!=0)
			{
				 
				 c = Character.toUpperCase(c);
				
					}
			
			str.append(c);
		}
		
		System.out.print(str.toString());
	}

	}



package Week1.day2;

public class Noofwords {

	public static void main(String[] args) {
		String s="Koushik Chatterjee and";
		//char[] charArray = s.toCharArray();
		int count =1;
		for (int i = 0; i < s.length()-1; i++) {
			if ((s.charAt(i) == ' ') && (s.charAt(i+1) != ' '))
					//if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
					{
				count++;
					}
		}
System.out.println(count);
	}

}

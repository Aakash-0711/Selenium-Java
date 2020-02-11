package week8.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Removedupl {

	public static void main(String[] args) {
		/*String s="Aakash Aagu";
        s.replaceAll("//s", "");
        char[] cs = s.toCharArray();
        int len = cs.length;
        for (int i = 0; i < len-1; i++) {
        	for (int j = 0; j < len-1; j++) {
        		
        		if(i!=j && s.charAt(i)==s.charAt(j)) {
        			System.out.println(s);
        		}
				
			} 
        	
        	
			
		}
	}*/
		String str="Aakash";
		str.replaceAll("\\S", "");
		char[] charArray = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		Set<Character> linkedHashSet = new LinkedHashSet<Character>();
		 
		for (int i = 0; i < str.length(); i++) {
		    linkedHashSet.add(str.charAt(i));
		}
		 
		for (Character c : linkedHashSet) {
		    sb.append(c);
		}
		System.out.println(sb.toString());
	}
	
}

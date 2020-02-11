package Week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DistinctCharacters {

	public static void main(String[] args) {

            String s="Amazon India Private Limited";
            String rep = s.replaceAll("\\s", "");
            //System.out.println(rep);
            
		
		StringBuilder sb = new StringBuilder();
		
		
		Set<Character> ls = new LinkedHashSet<Character>();
		
		for (int i = 0; i < rep.length(); i++) {
			
			ls.add(rep.charAt(i));
			
		}
		for (Character c : ls) {
			
			
			sb.append(c);
			//s.replaceAll("//s","");
			
		}
		System.out.println(sb);
			
		}

	}



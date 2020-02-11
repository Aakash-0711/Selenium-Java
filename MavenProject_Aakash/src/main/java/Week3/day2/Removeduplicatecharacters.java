package Week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Removeduplicatecharacters {

	public static void main(String[] args) {
		
		String s="PayPal India";
		s.replaceAll("//s", "");
		char[] cs= s.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			for (int j = 0; j < cs.length; j++) {
				
				if(i!=j && s.charAt(i)==s.charAt(j))
				{
				System.out.println(s);
			}
				
		
		}
	}
			
		/*
         String s="PayPal India"; 
		  s.replaceAll("//s", ""); 
		  char[] cs =s.toCharArray(); //StringBuffer sb = new StringBuffer();
		  
		  Map<Character, Integer> map = new LinkedHashMap<Character, Integer>(); 
		  
		  for(char c : cs) {
		  
		  if(map.containsKey("c")) 
		  { 
			  map.put(c, map.get(c)+1); 
			  }
		  else { 
			  map.put(c, 1); 
			  }
		  
		  
		  } 
		  for (Map.Entry c : map.entrySet()) 
		  {
		  
		  //if((int)c.getValue()== 1) 
		  {
			  
			  System.out.println(c.getKey());
		  
		  }
		  
		  System.out.println(map);
	}
	}
*/
	}
}



package Week3.day2;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {

	public static void main(String[] args) {
		
		String s="aakash";
		char[] charArray = s.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : charArray) {
			
			if(map.containsKey(c))
				
		{
				
				map.put(c,map.get(c)+1);
			}
			else
			{
				map.put(c,1);
			}
			
		}
        
		System.out.println(map);


	}

}

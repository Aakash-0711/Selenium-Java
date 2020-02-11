package Week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Duplicatecharacters {

	public static void main(String[] args) {
		String s="Infosys Limited";
		char[] cs = s.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (char c : cs) {
			if(map.containsKey(c))
			{
				int in = map.get(c);
				map.put(c, ++in);
			}
			else
			{
				map.put(c, 1);
			}
		}
     for (char c : map.keySet()) {
    	 
    	 if(map.get(c)>1)
    	 {
    		 System.out.print(c);
    	 }
	
	
}
	}

}

package week3.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Infosys {
	
	public static void main(String[] args) {
		
		String text="Infosys Limited";
				
				char[] array=text.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		for(char name:array)
		{
			if(map.containsKey(name))
					{
				Integer value=map.get(name)+1;
				
					map.put(name,value);
				
					}
			else
			{
				map.put(name,1);
			}
			
			
		}
		
       Set<Entry<Character, Integer>> entrySet = map.entrySet();
		
		Set<Integer> count= new TreeSet<>();
		
		for (Entry<Character, Integer> eachEntry : entrySet) {
			Integer value = eachEntry.getValue();
			count.add(value);
			
		}
		
		//System.out.println(count);
List<Integer> listCount = new ArrayList<>(count);
		
		Collections.reverse(listCount);
		
		//System.out.println(listCount.get(1));
		
		for (Entry<Character, Integer> entry : entrySet) {
			if(entry.getValue()>listCount.get(1)) {
				System.out.println(entry.getKey());
			}
			
		}

		
	}

}

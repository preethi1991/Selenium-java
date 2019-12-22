package day6.classrooom;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class map {
	
	public static void main(String[] args) {
		
		String name="Preethi";
		char[] array=name.toCharArray();
		
		Map <Character,Integer> myName=new HashMap<>();
		
		for(Entry<Character,Integer> eachentry:myName.entrySet())
		{
			System.out.println(eachentry.getKey()+"->" +eachentry.getValue());
		}
		
		
	}

}

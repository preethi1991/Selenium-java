package week3.assignments;

import java.util.HashSet;
import java.util.Set;

public class Paypal {
	
	public static void main(String[] args) {
	   String text="paypalindia";
	   
	   char[] array=text.toCharArray();
		
		Set<Character> names=new HashSet<>();
		
		for(char eacharray:array)
		{
			System.out.println(eacharray);

		
			names.add(eacharray);
		}
		
		System.out.println("After Removing duplicates");
		System.out.println(names);
		
		
		
	}

}

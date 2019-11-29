package week1.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		       //Declare a String 
				String text1 = "stop";
				//Declare another String
				String text2 = "made";
				
				//build logic to check the given words are anagram or not
				
				/*
				 * Pseudo Code
				 * a) Check length of the strings are same then
				 * b) Convert both Strings in to characters
				 * c) Sort Both the arrays
				 * d) Check both the arrays has same value
				 * 
				 */

				if(text1.length()==text2.length())
				{
					char[] test1=text1.toCharArray();
					char[] test2=text2.toCharArray();
					Arrays.sort(test1);
					Arrays.sort(test2);
					if (Arrays.equals(test1,test2))
					{
						System.out.println("Its an Anagram" );
					}
					else	
					{
						System.out.println("Not an Anagram" );
					}
				}
				
				else
				{
					System.out.println("Not Equal");
				}
				
	}

}

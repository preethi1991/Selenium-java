package day1.assignments;

public class PrimeNumber {
	
	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13
	 * output: 13 is a Prime Number
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */
	
	public static void main(String[] args) {

		// Declare an int Input and assign a value
		int value=10;
		int i,remain;
		
		// Declare a boolean input as flag
       boolean flag=false;
		// Iterate from 1 to half of the input
		for(i=1;i<value/2;i++)
		{
			
			// Divide the input with each for loop variable and check the remainder
			remain=value%2;
			 if(remain==0)
			 {
				// Set the flag as true when there is no remainder
				flag=true;
				break;
			 }
			 
		}		// break the iterator
				
		// Check the flag (Provide a condition)
		if(flag==true)
			// Print 'Prime' when the condition matches
			System.out.println("Its is not a prime number");
		else
			System.out.println("This is  a prime number" +value);
		// Print 'Not a Prime' when the condition doesn't match 
			
	}

}

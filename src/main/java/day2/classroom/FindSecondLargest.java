package day2.classroom;

import java.util.Arrays;


public class FindSecondLargest {

	
	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,11,4,6,7};

		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the last but one and print
		 */
	
		Arrays.sort(data);
		int arrayLength=data.length;
		int secondLargest=data[arrayLength-2];
		System.out.println("Second largest" +secondLargest);
		
		
	}	
		
		
		
		// Print the second largest number	
		


}

package week3.assignments;



import java.util.LinkedHashSet;
import java.util.Set;

public class Amazon {

		public static void main(String[] args) {
		   String text="Amazon India Private Limited";
		   
		   char[] array=text.toCharArray();
			
			Set<Character> names=new LinkedHashSet<>();
			
			for(char eacharray:array)
			{
				System.out.println(eacharray);

			
				names.add(eacharray);
			}
			
			System.out.println("After Removing duplicates");
			System.out.println(names);
			
			
			
		}

	}




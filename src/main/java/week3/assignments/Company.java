package week3.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {
	
	public static void main(String[] args) {
		
	
	
	List<String> companynames=new ArrayList<>();
	
	System.out.println(" Get the company names");
	companynames.add("HCL");
	companynames.add("Aspire Systems");
	companynames.add("CTS");
	System.out.println(" Sorted Order");
	Collections.sort(companynames);
	System.out.println(companynames);
	System.out.println(" Reverse Sort");
	Collections.reverse(companynames);
	System.out.println(companynames);
	}
	

}

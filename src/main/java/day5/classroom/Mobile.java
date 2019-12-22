package day5.classroom;

public class Mobile {
	
	public void call()
	{
		System.out.println("Calling");
	}
	
	
	public String message()
	
	{
		
	 return "Hi";
	}
	
	public void contacts()
	{
		System.out.println("Saving the contacts");
	}

public static void main(String[] args) {
	
	Mobile phone= new Mobile();
	
	phone.call();
	System.out.println(phone.message());
	phone.contacts();
	
}

}


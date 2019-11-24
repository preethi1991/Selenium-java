package day1.classroom;

public class Mobile {
	
	public void getName(String name)
	{
		System.out.println("the name is " +name);
	}
	
	public String sendSms()
	{
		System.out.println("Sending SMS");
		return "hi";
	}
	
	public boolean shutdownMobile()
	{
	
	System.out.println("Shudown in progress");
	return true;
	}

public static void main(String[] args)
{
	Mobile hitech= new Mobile();
	hitech.getName("Preethi");
	String message = hitech.sendSms();
	System.out.println(message);
	boolean result=hitech.shutdownMobile();
	System.out.println(result);
}
}
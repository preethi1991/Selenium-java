package day5.classroom;

public class Redmi extends Mobile{
	
	public void redminote()
	{
		System.out.println("This is redminote");
	}
	
	public void call()
	{
		System.out.println(" Video call allowed");
	}
	
	public static void main(String[] args) {
		Redmi mi=new Redmi();
		mi.call();
		System.out.println(mi.message());
		mi.redminote();
	}

}

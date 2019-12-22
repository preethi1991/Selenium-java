package day5.classroom;



public class Samsung extends Mobile{
	
	public void getColor()
	{
	System.out.println(" Colour of samsung is red");			
	}
	
	public void getColor(int Amount)
	{
	if(Amount>10000)
	{
		System.out.println("Its blue");
	}
	else
	{
		System.out.println(" This is Grey Colour");
	}
	}
	public String getColor(String who,long no)
	{
		if(who.equals("Preethi")&& no==9884966849L)
		{
			return "This is your Phone";
		}
		else
		{
			return " Not my phone";
	    }
	}
	
	
	public static void main(String[] args) {
		Samsung sung=new Samsung();
		sung.call();
		sung.contacts();
		System.out.println(sung.getColor("Preethi",9884966849L));
		sung.getColor(5000);
		
	
	
	}
	
	

}

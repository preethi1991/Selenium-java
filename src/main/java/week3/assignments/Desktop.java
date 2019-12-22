package week3.assignments;

public class Desktop implements Hardware,Software{

	@Override
	public void softwareresources() {

    System.out.println(" These are software resources");
		
	}

	@Override
	public void hardwareresources() {

 System.out.println(" These are harware resources");
		
	}
	
	public void desktopModel()
	{
		System.out.println(" the desktop model is HP");
	}
	
	public static void main(String[] args) {
		
		Desktop dk=new Desktop();
		dk.hardwareresources();
		dk.softwareresources();
		dk.desktopModel();
	}
	

}

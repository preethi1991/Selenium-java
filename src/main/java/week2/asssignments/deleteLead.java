package week2.asssignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class deleteLead {
@Test
public  void  DeleteLead() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Initiate the ChromeBroswer
		ChromeDriver driver=new ChromeDriver();

		// Maximize the browser
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        
        WebElement userName=driver.findElementById("username");
		userName.sendKeys("DemoSalesManager");
		WebElement password = driver.findElementById("password");
		password.sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByName("phoneNumber").sendKeys("9884966839");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		/*Thread.sleep(3000);
		String fLead=driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
		System.out.println(" the id is " +fLead);
		
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		driver.findElementByClassName("subMenuButtonDangerous").click();
		Thread.sleep(2000);
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(fLead);
		driver.findElementByXPath("//button[text()='Find Leads']").click();*/
		String fLeadout=driver.findElementByClassName("x-paging-info").getText();
		System.out.println(" the id is " +fLeadout);
		if(fLeadout.equals("No records to display"))
		{
			System.out.println("Yes No records to display");
		}
		else
		{
			System.out.println("No, No records to display");
		}
		}
		
		
		
		
}


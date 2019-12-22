package week2.asssignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class editLead {
@Test	
public void EditLead() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Initiate the ChromeBroswer
		ChromeDriver driver=new ChromeDriver();

		// Maximize the browser
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        
        WebElement userName=driver.findElementById("username1");
		userName.sendKeys("DemoSalesManager");
		WebElement password = driver.findElementById("password");
		password.sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//input[@class='x-form-text x-form-field' or @name='firstName'])[3]").sendKeys("Preethi");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		String name=driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]").getText();
		System.out.println("First Name in find leadspage is"+name);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]").click();
	    driver.findElementByXPath("//a[text()='Edit']").click();
		WebElement company=driver.findElementById("updateLeadForm_companyName");
		company.clear();
		company.sendKeys("Wipro");
		driver.findElementByXPath("(//input[@class='smallSubmit'])[1]").click();
		String Company=driver.findElementById("viewLead_companyName_sp").getText();
		if(Company.contains("Wipro"))
		{
			System.out.println("its Wipro");
		}
			
			else
			{
				System.out.println("Not update");
			}
		
driver.close();
}
}

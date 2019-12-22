package day3.classroom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLeadWithSelect {
@Test
	public void createLeadwithselect() {

		// Set the property for ChromeDriver
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

				// Initiate the ChromeBroswer
				ChromeDriver driver=new ChromeDriver();

				// Maximize the browser
		        driver.get("http://leaftaps.com/opentaps/control/main");
		        driver.manage().window().maximize();
				// Enter the UserName
		WebElement userName=driver.findElementById("username");
		userName.sendKeys("DemoSalesManager");
		// Enter the Password
		WebElement password = driver.findElementById("password");
		password.sendKeys("crmsfa");
		// Click on Login Button
		driver.findElementByClassName("decorativeSubmit").click();
		// Click on crm/sfa button
		driver.findElementByLinkText("CRM/SFA").click();
		// Click on Leads
		driver.findElementByLinkText("Leads").click();
		// Click on Create Lead button
		driver.findElementByLinkText("Create Lead").click();
		// Enter Company Name
		driver.findElementById("createLeadForm_companyName").sendKeys("Test Leaf");
		// Enter First Name
		driver.findElementById("createLeadForm_firstName").sendKeys("Preethi");
		// Enter Last Name
		driver.findElementById("createLeadForm_lastName").sendKeys("Sylvia");

		// Select 'Source' as 'Other' (Handling DropDown)
         Select dd=new Select(driver.findElementById("createLeadForm_dataSourceId"));
         dd.selectByVisibleText("Other");
		// Select 'Preferred Currency' as 'INR'
         Select cur=new Select(driver.findElementById("createLeadForm_currencyUomId"));
         cur.selectByValue("INR");
         
         Select mar=new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
         List<WebElement> options=mar.getOptions();
         int option=options.size();
         mar.selectByIndex(option-1);
         
         Select ind=new Select(driver.findElementById("createLeadForm_industryEnumId"));
         ind.selectByValue("IND_FINANCE");
         
         Select own=new Select(driver.findElementById("createLeadForm_ownershipEnumId"));
         own.selectByValue("OWN_CCORP");
         driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9884966839");
         
		// Click on Create Lead (Submit) button
        driver.findElementByClassName("smallSubmit").click();
		// Verify the Lead is created by checking the Company or First Name
     

	}

}

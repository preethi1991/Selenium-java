package day9.classroom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Annotations {
	
	public ChromeDriver driver;
	@BeforeMethod
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Initiate the ChromeBroswer
	driver=new ChromeDriver();

		// Maximize the browser
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
		// Enter the UserName
        WebElement userName=driver.findElementById("username");
        userName.sendKeys("DemoSalesManager");
        // Enter the Password
        WebElement password = driver.findElementById("password");
        password.sendKeys("crmsfa");
	}
	
	@AfterMethod
	public void logout()
	{
		driver.close();
	}

}

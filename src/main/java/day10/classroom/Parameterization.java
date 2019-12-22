package day10.classroom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class Parameterization {

	public ChromeDriver driver;
	@BeforeMethod
	@Parameters({"url","username","password"})
	public void login(String url,String uname,String pass)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Initiate the ChromeBroswer
	driver=new ChromeDriver();

		// Maximize the browser
        driver.get(url);
        driver.manage().window().maximize();
		// Enter the UserName
        WebElement userName=driver.findElementById("username");
        userName.sendKeys(uname);
        // Enter the Password
        WebElement password = driver.findElementById("password");
        password.sendKeys(pass);
	}
	
	@AfterMethod
	public void logout()
	{
		driver.close();
	}
	
	@DataProvider
	public String[][] getData(){
		String[][] data=new String[2][3];
		data[0][0]="Testleaf";
				data[0][1]="Swathy";
				data[0][2]="viki";
				
				data[1][0]="Wipro";
				data[1][1]="Preethi";
				data[1][2]="Sylvia";
				return data;
				
				
	}
	
	}





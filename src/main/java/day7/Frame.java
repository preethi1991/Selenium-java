package day7;

import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	

	public static void main(String[] args) {

		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Initiate the ChromeBroswer
		ChromeDriver driver=new ChromeDriver();

		// Maximize the browser
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        driver.manage().window().maximize();
        driver.switchTo().frame("iframeResult");
        driver.findElementByXPath("//button[.='Try it']").click();
        driver.switchTo().alert().sendKeys("Preethi");
        driver.switchTo().alert().accept();
     String text=driver.findElementByXPath("//button[.='Try it']/following::p").getText();
     if(text.contains("Preethi"))
     {
    	System.out.println("Success"); 
     }
        
        
        
        
	}        

}

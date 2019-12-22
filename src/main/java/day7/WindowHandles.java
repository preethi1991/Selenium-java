package day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	
	public static void main(String[] args) {
	
	
	// Set the property for ChromeDriver
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

			// Initiate the ChromeBroswer
			ChromeDriver driver=new ChromeDriver();

			// Maximize the browser
	        driver.get("http://leafground.com/pages/Window.html");
	        driver.manage().window().maximize();
	        driver.findElementByXPath("//button[.='Open Multiple Windows']").click();
	        //driver.switchTo().window("windowHandle");
	        
	        Set<String> windowHandles=driver.getWindowHandles();
	        System.out.println("Size of Window" +windowHandles.size());
	        List<String> lstWindowHandles=new ArrayList<String>(windowHandles);
	        for(String allTitles:lstWindowHandles)
	        {
	        	WebDriver allwindows = driver.switchTo().window(allTitles);
	        	System.out.println(allwindows.getTitle());
	        }
	       // String lastWindow=lstWindowHandles.get(windowHandles.size()-2);
	        //driver.switchTo().window(lastWindow);
	        //String title=driver.getTitle();
	        //System.out.println(title);
	        
	        
	}

}

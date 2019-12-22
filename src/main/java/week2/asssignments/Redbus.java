package week2.asssignments;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class Redbus {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Initiate the ChromeBroswer
		ChromeDriver driver=new ChromeDriver();

		// Maximize the browser
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement source=driver.findElementByXPath("//input[@id='src']");
        source.sendKeys("Chennai");
        Thread.sleep(2000);
        source.sendKeys(Keys.TAB);
        Thread.sleep(2000);
        WebElement destination=driver.findElementByXPath("//input[@id='dest']");
        destination.sendKeys("Trichy");
        Thread.sleep(2000);
        destination.sendKeys(Keys.TAB);
        Thread.sleep(2000);
        //driver.findElementByXPath("//div[@id='driver.findElementByXPath(']//td[@class='current day']").click();
        //driver.findElementByXPath("//table[@class='rb-monthTable first last']//td[@class='we day']").click();
        driver.findElementByXPath("//div[@id='rb-calendar_onward_cal']//td[@class='current day']").click();
        Thread.sleep(1000);
        driver.findElementByXPath("//span[@class='fl icon-calendar_icon-new icon-return-calendar icon']").click();
        driver.findElementByXPath("//div[@id='rb-calendar_return_cal']//td[@class='we day']").click();
        Thread.sleep(2000);
        
        
        WebElement search=driver.findElement(By.id("search_btn"));
        search.click();
        Thread.sleep(2000);
      WebElement clickpm=driver.findElementByXPath("//ul[@class='dept-time dt-time-filter']//label[@title='After 6 pm']");
      clickpm.click();
      Thread.sleep(2000);
      WebElement aircond=driver.findElementByXPath("(//ul[@class='list-chkbox']//label[@class='custom-checkbox'])[3]");
      aircond.click();
    
      String totalBus=driver.findElementByClassName("//div[@class='sort-sec clearfix onward ']//span[@class='f-bold busFound']").getText();
      System.out.println("TotalBuses found " +totalBus);
      
        
	    //driver.quit();
	    

}

}


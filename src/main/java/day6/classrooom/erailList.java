package day6.classrooom;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class erailList {

		
		

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

			// Initiate the ChromeBroswer
			ChromeDriver driver=new ChromeDriver();

			// Maximize the browser
	        driver.get("https://erail.in/");
	        driver.manage().window().maximize();
	        WebElement source=driver.findElementById("txtStationFrom");
	        source.clear();
	        source.sendKeys("MAS",Keys.TAB);
	        WebElement destination=driver.findElementById("txtStationTo");
	        destination.clear();
	        destination.sendKeys("SBC",Keys.TAB);
	        Thread.sleep(3000);
	        driver.findElementById("chkSelectDateOnly").click();
		    WebElement noTrains = driver.findElementByXPath("//div[@id='divMain']/div[1]");
		    System.out.println(noTrains.getText());
		    
		   
		    List<WebElement> tNames = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//td[2]");
		    
		    int tSize=tNames.size();
		    
		    
		    System.out.println("Sixe in list" +tSize);
		    
		    Set<String> tnamesinset=new HashSet<>();
		    
		    for (WebElement alltrains : tNames)
		    {
		    	String eachtrainname=alltrains.getText();
		    	tnamesinset.add(eachtrainname);
		    }
		    
		    if(tnamesinset.size()==tSize)
		    {
		    	System.out.println("Its not duplicated");
		    }
		    
		   
		    
	
		}

}


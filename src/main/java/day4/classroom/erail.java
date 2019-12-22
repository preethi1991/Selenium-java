package day4.classroom;

import java.util.List;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class erail {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Initiate the ChromeBroswer
		ChromeDriver driver=new ChromeDriver();

		// Maximize the browser
        driver.get("https://erail/in/");
        driver.manage().window().maximize();
        WebElement source=driver.findElementById("txtStationFrom");
        source.clear();
        source.sendKeys("Pondicherry",Keys.TAB);
        WebElement destination=driver.findElementById("txtStationTo");
        destination.clear();
        destination.sendKeys("MAS",Keys.TAB);
        Thread.sleep(3000);
        WebElement eleTable=driver.findElementByXpath("//table[@class='DataTable TrainList TrainListHeader']");
        List<WebElement> eleRows=eleTable.findElements(By.tagName("tr"));
        int size=eleRows.size();
        List<WebElement> colms=eleRows.get(1).findElements(By.tagName("td"));
        for(int i=0;i<colms.size();i++)
        {
        	System.out.println(colms.get(i).getText());
        }
	}

}

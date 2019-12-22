package day3.classroom;

import org.openqa.selenium.chrome.ChromeDriver;

public class button {
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();

	// Maximize the browser
    driver.get("http://leafground.com/pages/Button.html");
    driver.manage().window().maximize();
    
    
    driver.findElementById("home").click();
    driver.findElementByClassName("wp-categories-title").click();

    

}
}
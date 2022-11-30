package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemoMain2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/AdityaDua/Documents/chromedriver");

    	WebDriver driver = new ChromeDriver();
    	
    	String url ="https://demoqa.com/text-box";
    	
    	driver.get(url);
    	
    	WebElement firstNameElement = driver.findElement(By.xpath("//input[@id='userName'])"));
    			
    		firstNameElement.sendKeys("user name from se");
    			
    			Thread.sleep(5000);
    			driver.close();
    			driver.quit();

	}


}

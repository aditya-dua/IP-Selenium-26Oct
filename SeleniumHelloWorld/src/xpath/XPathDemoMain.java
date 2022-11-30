package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemoMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/AdityaDua/Documents/chromedriver");

    	WebDriver driver = new ChromeDriver();
    	
    	String url ="https://demoqa.com/text-box";
    	
    	driver.get(url);
    	
    	WebElement firstNameElement =  driver.
    			findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[2]/input[1]"));
    	
    	firstNameElement.sendKeys("User Name from Selenium");
    	
    	Thread.sleep(5000);
    	
    	driver.close();
    	driver.quit();

	}


}

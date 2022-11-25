package alerts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DelayedAlertMain2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/AdityaDua/Documents/chromedriver");

    	WebDriver driver = new ChromeDriver();
    	
    	String url ="https://demoqa.com/links";
    	
    	driver.get(url);
    	
    	driver.manage().window().maximize();
    	
    	
    	
    	List<WebElement> alllinks=  driver.findElements(By.tagName("a"));
		
		//Traversing through the list and printing its test along with link address
		for (WebElement link:alllinks) {
			
			
			System.out.println(link.getText()+"-"+ link.getAttribute("href") );
	
			//Commenting driver.quit() for user to easily verify the links
		//driver.quit();
    	
		}
    	
    	
	}

}

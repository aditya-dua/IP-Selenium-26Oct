import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkWebElementMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/AdityaDua/Documents/chromedriver");

    	WebDriver driver = new ChromeDriver();
    	
    	String url ="https://demoqa.com/links";
    	
    	driver.get(url);
    	
    	
    	List<WebElement> links= driver.findElements(By.tagName("a"));
    	
    	for (Iterator iterator = links.iterator(); iterator.hasNext();) {
			WebElement webElement = (WebElement) iterator.next();
			
			System.out.println(webElement.getText());
			
		}
    	
    	
    	
	}

}

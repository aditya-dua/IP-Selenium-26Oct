import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {

	public static void main(String[] args){
		// TODO Auto-generated method stub
//		//Windows - Chrome Driver
//		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
//		
//		//Windows - Gecko Driver
//		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
	
		// Mac - Chrome Driver
    	System.setProperty("webdriver.chrome.driver","/Users/AdityaDua/Documents/chromedriver");

    	WebDriver driver = new ChromeDriver();
    	
    	String url ="https://demoqa.com/automation-practice-form";
    	
    	driver.get(url);
    	
    	WebElement fullNameElement =  driver.findElement(By.id("username"));
    	
    	
    	
		
	}

}

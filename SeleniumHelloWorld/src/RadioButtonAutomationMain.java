import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAutomationMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/AdityaDua/Documents/chromedriver");

    	WebDriver driver = new ChromeDriver();
    	
    	String url ="https://demoqa.com/radio-button";
    	
    	driver.get(url);
    	//Thread.sleep(10000);

    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    	WebElement yesElement = driver.findElement(By.id("yesRadio"));
    	
    	System.out.println("Yes Radio Selected "+yesElement.isSelected());
    	//yesElement.click();
    	System.out.println("Yes Radio Selected "+yesElement.isSelected());

    	WebElement impressiveElement = driver.findElement(By.id("impressiveRadio"));
    	
    	System.out.println("impressive Radio Selected "+impressiveElement.isSelected());
    	//impressiveElement.click();
    	System.out.println("impressive Radio Selected "+impressiveElement.isSelected());
    	
    	WebElement noElement = driver.findElement(By.id("noRadio"));

    	System.out.println("No Radio Selected "+noElement.isSelected());
    	System.out.println("No Radio Enabled "+noElement.isEnabled());
    	
    	Thread.sleep(5000);
    	
    	driver.close();
    	
    	
	}

}

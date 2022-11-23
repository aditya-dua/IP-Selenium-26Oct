import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxAutomationMain {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/AdityaDua/Documents/chromedriver");

    	WebDriver driver = new ChromeDriver();
    	
    	String url ="https://demoqa.com/text-box";
    	
    	driver.get(url);
    	WebElement userNameElement =  driver.findElement(By.id("userName"));
    	userNameElement.sendKeys("Aditya");
    	
    	WebElement userEmailElement =  driver.findElement(By.id("userEmail"));
    	userEmailElement.sendKeys("aditya@aditya.com");
    	
    	WebElement currentAddressElement =  driver.findElement(By.id("currentAddress"));
    	currentAddressElement.sendKeys("Address Line -1");
    	
    	
    	WebElement permanentAddressElement =  driver.findElement(By.id("permanentAddress"));
    	permanentAddressElement.sendKeys("Permanent Address Line -1");
    	
    	Thread.sleep(5000);
    	
    	WebElement submitButtonElement =  driver.findElement(By.id("submit"));
    	submitButtonElement.click();
    	
    	Thread.sleep(5000);

    	driver.close();
		
	}

}

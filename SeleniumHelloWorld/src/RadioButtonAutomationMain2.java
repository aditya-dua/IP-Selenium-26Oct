import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAutomationMain2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/AdityaDua/Documents/chromedriver");

    	WebDriver driver = new ChromeDriver();
    	
    	String url ="https://demo.guru99.com/test/radio.html";
    	
    	driver.get(url);
    	Thread.sleep(5000);

    	
    	WebElement yesElement = driver.findElement(By.id("vfb-7-1"));
    	
    	System.out.println("Yes Radio Selected "+yesElement.isSelected());
    	yesElement.click();
    	System.out.println("Yes Radio Selected "+yesElement.isSelected());

    	
    	Thread.sleep(5000);
    	
    	driver.close();
    	
    	
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/AdityaDua/Documents/chromedriver");

    	WebDriver driver = new ChromeDriver();
    	
    	String url ="https://www.facebook.com/";
    	
    	driver.get(url);
    	
    	driver.manage().window().maximize();
    	
    	WebElement element = driver.findElement(By.className("inputtext"));
    	
    	element.sendKeys("My User Name");
    	
    	Thread.sleep(10000);
    	
    	driver.close();
    	driver.quit();
	}

}

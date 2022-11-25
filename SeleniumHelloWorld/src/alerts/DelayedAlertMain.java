package alerts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DelayedAlertMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/AdityaDua/Documents/chromedriver");

    	WebDriver driver = new ChromeDriver();
    	
    	String url ="https://demoqa.com/alerts";
    	
    	driver.get(url);
    	
    	driver.manage().window().maximize();
    	
    	WebElement element = driver.findElement(By.id("timerAlertButton"));
    	element.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	
    	wait.until(ExpectedConditions.alertIsPresent());
    	
    	Alert simpleAlert = driver.switchTo().alert();
    	
    	simpleAlert.accept();
    	
    	Thread.sleep(2000);
    	driver.quit();
    	
    	
    	
    	
    	
	}

}

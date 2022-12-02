package alerts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
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
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	
    	//wait.until(ExpectedConditions.alertIsPresent());
    	
    	Wait<WebDriver> fWait = new FluentWait<>(driver)
    			.withTimeout(Duration.ofSeconds(10))
    			.pollingEvery(Duration.ofSeconds(1))
    			.ignoring(Exception.class);
    	/*
    	 * 
    	 * alertIsPresent()
			elementSelectionStateToBe()
			elementToBeClickable()
			elementToBeSelected()
			frameToBeAvaliableAndSwitchToIt()
			invisibilityOfTheElementLocated()
			invisibilityOfElementWithText()
			presenceOfAllElementsLocatedBy()
			presenceOfElementLocated()
			textToBePresentInElement()
			textToBePresentInElementLocated()
			textToBePresentInElementValue()
			titleIs()
			titleContains()
			visibilityOf()
			visibilityOfAllElements()
			visibilityOfAllElementsLocatedBy()
			visibilityOfElementLocated()
    	 */
    	Alert simpleAlert = driver.switchTo().alert();
    	
    	simpleAlert.accept();
    	
    	Thread.sleep(2000);
    	driver.quit();
    	
    	
    	
    	
    	
    	
	}

}

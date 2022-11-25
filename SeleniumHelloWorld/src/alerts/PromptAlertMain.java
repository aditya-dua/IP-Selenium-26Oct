package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlertMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/AdityaDua/Documents/chromedriver");

    	WebDriver driver = new ChromeDriver();
    	
    	String url ="https://demoqa.com/alerts";
    	
    	driver.get(url);
    	
    	driver.manage().window().maximize();
    	
    	WebElement element = driver.findElement(By.id("promtButton"));
    	
    	
    	((JavascriptExecutor)driver).executeScript("arguments[0].click()", element);
    	
    	Alert promptText = driver.switchTo().alert();
    	
    	String alertText = promptText.getText();
    	System.out.println("Aert text is::"+alertText);
    	
    	promptText.sendKeys("username001");
    	promptText.accept();
    	
    	
    	
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TitleValidationTest2 {
	String baseurl="https://demo.guru99.com/test/newtours/";
	String driverPath = "/Users/AdityaDua/Documents/chromedriver";

	WebDriver driver=null;
	  
	
	  @Test
	  public void reg() throws InterruptedException {
		  
		  String regXpath= "/html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]";
		  
		  System.out.println("Test run");
		  Thread.sleep(5000);
		  
		WebElement register = driver.findElement(By.linkText("REGISTER"));
		register.click();
		
	  }
	  @BeforeTest
	  public void url() {
		  
		  System.setProperty("webdriver.chrome.driver",driverPath);	
			
			driver = new ChromeDriver();
			
			String url = baseurl;
			
			driver.get(url);
			
			driver.manage().window().maximize();
			
	  }
  
}

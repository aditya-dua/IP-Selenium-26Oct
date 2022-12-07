import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TitleValidationTest {
	
	String baseURL = "http://demo.guru99.com/test/newtours/";
	String driverPath = "/Users/AdityaDua/Documents/chromedriver";
	WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("Launch the Chrome Browser.");
		
		System.setProperty("webdriver.chrome.driver",driverPath);

		driver=new ChromeDriver();
		
		driver.get(baseURL);
	}
	
	@Test
	public void validateTitle() {
		String title = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(title, actualTitle);
		
		
	}
	
	@AfterTest
	public void terminateWindow() {
		driver.close();
		driver.quit();
	}
	
  
}

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InsuranceProjectMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/AdityaDua/Documents/chromedriver");

    	WebDriver driver = new ChromeDriver();
    	
    	String url ="https://demo.guru99.com/insurance/v1/index.php";
    	
    	driver.get(url);
    	Thread.sleep(5000);

    	driver.findElement(By.linkText("Register")).click();
    	/*List<WebElement> aLinks = driver.findElements(By.tagName("a"));
    	
    	String text;
    	for (WebElement webElement : aLinks) {
			
    		text = webElement.getText();
    		if(text.equals("Register")) {
    			System.out.println("Register button found and will be clicked");
    			webElement.click();
    			break;
    		}
		}*/
    	
    	
    	
    	driver.close();
    	
    	
	}

}

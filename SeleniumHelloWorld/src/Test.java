import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args){
		// TODO Auto-generated method stub
//		//Windows - Chrome Driver
//		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
//		
//		//Windows - Gecko Driver
//		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
	
		// Mac - Chrome Driver
    	System.setProperty("webdriver.chrome.driver","/Users/AdityaDua/Documents/chromedriver");

    	WebDriver driver = new ChromeDriver();
    	
    	String url ="https://www.google.com";
    	
    	driver.get(url);

    	
    	System.out.println("The title of the page is :"+driver.getTitle());
    	System.out.println("The URL of the page is :"+driver.getCurrentUrl());

    	driver.navigate().refresh();
    	driver.navigate().to("https://example.com");
    	
    	System.out.println("The new title of the page is :"+driver.getTitle());
    	System.out.println("The new URL of the page is :"+driver.getCurrentUrl());

    	//driver.navigate().back();
    	
    	String pageSource = driver.getPageSource();
    	
    	System.out.println("The Page source of the URL:"+driver.getCurrentUrl()+" is :"+pageSource);

    	
    	
    	
    	//driver.quit();
    	
    	
		
	}

}

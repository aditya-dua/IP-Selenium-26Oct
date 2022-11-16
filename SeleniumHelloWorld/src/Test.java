import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//Windows - Chrome Driver
//		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
//		
//		//Windows - Gecko Driver
//		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
//			
	
		// Mac - Chrome Driver
    	System.setProperty("webdriver.chrome.driver","/Users/AdityaDua/Documents/chromedriver");

    	WebDriver driver = new ChromeDriver();
    	
    	String url ="https://www.google.com";
    	
    	driver.get(url);
    	
    	System.out.println("The title of the page is :"+driver.getTitle());
		
	}

}

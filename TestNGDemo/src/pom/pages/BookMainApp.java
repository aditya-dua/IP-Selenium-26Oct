package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMainApp {

	// POM + DDF
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/AdityaDua/Documents/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get ("https://demoqa.com/books");
		
		LoginPage login = new LoginPage(driver);
		
		login.enterUsername("aditya");
		login.enterPassword("aditya");
		login.click();
		
		DashboardPage dp = new DashboardPage();
		
		
	}

}

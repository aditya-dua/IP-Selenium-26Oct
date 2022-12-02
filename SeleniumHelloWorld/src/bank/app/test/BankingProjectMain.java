package bank.app.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BankingProjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		///WebDriver
		System.setProperty("webdriver.chrome.driver","/Users/AdityaDua/Documents/chromedriver");

    	WebDriver driver = new ChromeDriver();
    	
    	driver.get("https://demo.guru99.com/Agile_Project/Agi_V1/");
    	
    	LoginTest lt = new LoginTest();
    	lt.testLogin(driver);
    	
    	CustomerTest ct = new CustomerTest();
    	ct.generateMiniStatement(driver);
    	
		
		/*
		 * 
		 * 1. Set the system property
		 * 2. Create the object of Webdriver
		 * 3. Launch the site
		 * 4. create the object of login Class first
		 * 5. call the function of login class
		 * ..Repeat the steps for other classes. 
		 * 
		 * Printing: Window based alerts and these are tested using Robot framework
		 * 
		 * Some approach for change of driver?
		 * run a test from chrome and some test on firefox and some on IE.
		 */
    	driver.close();
    	
    	///WebDriver
    	System.setProperty("webdriver.gecko.driver","/Users/AdityaDua/Documents/geckodriver");

    	WebDriver firefoxDrover = new FirefoxDriver();
		
    	firefoxDrover.get("https://demo.guru99.com/Agile_Project/Agi_V1/");
    	
    	
    	lt.testLogin(firefoxDrover);
    	/*
		 * 
		 * 1. Set the system property
		 * 2. Create the object of Webdriver
		 * 3. Launch the site
		 * 4. create the object of login Class first
		 * 5. call the function of login class
		 * ..Repeat the steps for other classes. 
		 * 
		 * Printing: Window based alerts and these are tested using Robot framework
		 * 
		 * Some approach for change of driver?
		 * run a test from chrome and some test on firefox and some on IE.
		 */
    	
    	firefoxDrover.close();
	}

}

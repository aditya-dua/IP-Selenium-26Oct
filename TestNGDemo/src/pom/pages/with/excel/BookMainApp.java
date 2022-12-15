package pom.pages.with.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookMainApp {
	
	String browser;
	String username;
	String password;
	WebDriver driver;
	
	
	@BeforeSuite
	public void loadTestData() throws IOException {
		FileInputStream fs = new FileInputStream("Test-Case.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row row = sheet.getRow(2);
		browser = sheet.getRow(2).getCell(0).toString();
		username = sheet.getRow(2).getCell(1).toString();
		password = sheet.getRow(2).getCell(2).toString();

		System.out.println("Browser:"+browser+" Username :"+username+" Password:"+password);
	}
	
	@BeforeTest
	public void setupBrowser() {
		if(browser == null) {
			System.out.println("Data cannot be read, try again!");
		}else {
			if(browser.equals("chrome")) {
				setupChrome();
			}else {
				setupFirefox();
			}
			
			driver.get("https://demoqa.com/login");
		}
		
	}
	
	@Test
	public void testLogin() {
		
		LoginPage loginP = new LoginPage(driver);
		loginP.enterUsername(username);
		loginP.enterPassword(password);
		loginP.click();
		
	}
	
	
	
	public void setupChrome() {
		System.setProperty("webdriver.chrome.driver","/Users/AdityaDua/Documents/chromedriver");

    	driver = new ChromeDriver();
	}
	
	public void setupFirefox() {
		System.setProperty("webdriver.gecko.driver","/Users/AdityaDua/Documents/geckodriver");

    	driver = new FirefoxDriver();
		
  	
	}
	

}

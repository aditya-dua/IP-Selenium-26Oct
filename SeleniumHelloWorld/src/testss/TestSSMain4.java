package testss;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import util.Utility;

public class TestSSMain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/AdityaDua/Documents/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		String url = "https://demo.guru99.com/insurance/v1/index.php" ;
		driver.get( url);
		driver.findElement(By.linkText("Register")).click();
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("ss-mahadevi.png");
		
		try
		{
			FileUtils.copyFile(srcFile, destFile);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}

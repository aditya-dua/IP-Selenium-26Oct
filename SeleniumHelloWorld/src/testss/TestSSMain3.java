package testss;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import util.Utility;

public class TestSSMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/AdityaDua/Documents/chromedriver");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/insurance/v1/index.php");
		driver.findElement(By.linkText("Register")).click();
		
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		
		File destFile = new File( "ss.png");
		
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

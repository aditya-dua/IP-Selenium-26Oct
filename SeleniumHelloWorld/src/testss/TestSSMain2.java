package testss;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import util.Utility;

public class TestSSMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/AdityaDua/Documents/chromedriver");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/insurance/v1/index.php");
		driver.findElement(By.linkText("Register")).click();
		
		try {
			Utility.takeScreenShot(driver, "ss.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package util;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	public static void takeScreenShot(WebDriver driver, String path) {
		
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		
				
		
	}
}

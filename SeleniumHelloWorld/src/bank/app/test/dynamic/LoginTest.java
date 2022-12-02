package bank.app.test.dynamic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTest {
	
	public void testLogin(WebDriver driver,String usernameData) {
		/*
		 * Write your code to test the Login Functionality
		 * 
		 * */
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys(usernameData);
		
		
		WebElement password = driver.findElement(By.id("password"));
		username.sendKeys("username");
		
	}

}

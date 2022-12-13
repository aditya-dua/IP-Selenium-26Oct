package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		//uNameElement = driver.findElement("By")
	}
	
	WebElement uNameElement;
	// Web Elements
	By uName= By.id("userName");
	By password= By.id("userName");
	By loginBtn= By.id("userName");
	
	//Actions
	public void enterUsername(String username) {
		driver.findElement(uName).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(uName).sendKeys(password);
	}
	
	public void click() {
		driver.findElement(loginBtn).click();
	}

}

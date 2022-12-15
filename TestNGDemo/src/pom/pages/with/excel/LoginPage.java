package pom.pages.with.excel;

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
	
	
	By uName= By.id("userName");
	By passwordBy= By.id("password");
	By loginBtn= By.id("login");
	
	//Actions
	public void enterUsername(String username) {
		driver.findElement(uName).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(passwordBy).sendKeys(password);
	}
	
	public void click() {
		driver.findElement(loginBtn).click();
	}

}

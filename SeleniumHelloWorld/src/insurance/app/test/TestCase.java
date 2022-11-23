package insurance.app.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {

	public void test(boolean login, String url) throws InterruptedException {
		if(login) {
			loginTest(url);
		}else {
			registerTest(url);
		}
	}
	
	private void loginTest(String url) {
		// you will have to write
	}
	
	private void registerTest(String url) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/AdityaDua/Documents/chromedriver");

		WebDriver driver=new ChromeDriver();
		url = "https://demo.guru99.com/insurance/v1/index.php";
		driver.get(url);
		driver.findElement(By.linkText("Register")).click();
		
    	
    	
		WebElement firstname = driver.findElement(By.id("user_firstname"));
		firstname.sendKeys("Parsharamulu");
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Arukuta");
		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("1234567891");
		WebElement Full = driver.findElement(By.name("licencetype"));
		Full.click();
		WebElement Adress = driver.findElement(By.name("street"));
		Adress.sendKeys("xyz street");
		WebElement City = driver.findElement(By.name("city"));
		City.sendKeys("abc city");
		WebElement Country = driver.findElement(By.name("county"));
		Country.sendKeys("India");
		WebElement postcode = driver.findElement(By.name("post_code"));
		postcode.sendKeys("123456");
		WebElement Email = driver.findElement(By.name("email"));
		Email.sendKeys("abc@gmail.com");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Abc@123");
		WebElement confirmpassword = driver.findElement(By.name("c_password"));
		confirmpassword.sendKeys("Abc@123");
		WebElement create = driver.findElement(By.name("submit"));
		Thread.sleep(5000);
		create.click();
		Thread.sleep(5000);
		WebElement loginemail = driver.findElement(By.name("email"));
		loginemail.sendKeys("abc@gmail.com");
		WebElement loginpassword= driver.findElement(By.name("password"));
		loginpassword.sendKeys("Abc@123");
		WebElement login= driver.findElement(By.name("submit"));
		login.click();
			
	}
}

package select.dropdown.testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/AdityaDua/Documents/chromedriver");

		WebDriver driver=new ChromeDriver();
		String url = "https://demoqa.com/select-menu";
		driver.get(url);
		
		driver.manage().window().maximize();
		
		Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
		
		//System.out.println(select.getAllSelectedOptions());
		
		List<WebElement> list =  select.getOptions();
		
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
		}
		
		select.selectByIndex(4);
		
		System.out.println("Selected Value is:"+ select.getFirstSelectedOption().getText());
		
		select.selectByValue("6");
		
		System.out.println("Selected Value is:"+ select.getFirstSelectedOption().getText());
		
		select.selectByVisibleText("Blue");
		
		System.out.println("Selected Value is:"+ select.getFirstSelectedOption().getText());

		driver.quit();
		
	}
	

}

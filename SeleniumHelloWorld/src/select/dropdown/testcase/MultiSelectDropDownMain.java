package select.dropdown.testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDownMain {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/AdityaDua/Documents/chromedriver");

		WebDriver driver=new ChromeDriver();
		String url = "https://demoqa.com/select-menu";
		driver.get(url);
		
		driver.manage().window().maximize();
		
		Select select = new Select(driver.findElement(By.id("cars")));
		
		List<WebElement> options = select.getOptions();
		
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
		
		System.out.println("Is the SeLeCT a Multi Select"+select.isMultiple());
		
		if(select.isMultiple()) {
			select.selectByIndex(1);		
			
			select.selectByVisibleText("Opel");
			
			List<WebElement> selectedOptions = select.getAllSelectedOptions();
			
			System.out.println("Selected OPtions are::");
			for (WebElement webElement : selectedOptions) {
				System.out.print(""+webElement.getText()+" ");
			}
			
			select.deselectByIndex(1);
			
			selectedOptions = select.getAllSelectedOptions();
			System.out.println();
			System.out.println("Selected Options after Deslection are::");
			for (WebElement webElement : selectedOptions) {
				System.out.print(""+webElement.getText()+" ");
			}
			
		}
	}

}

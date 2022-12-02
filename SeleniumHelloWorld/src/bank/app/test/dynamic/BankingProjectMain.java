package bank.app.test.dynamic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BankingProjectMain {

	public static void main(String[] args) {

		
		// We add a capablity to read data from an excel file
		try {
			FileInputStream fis = new FileInputStream("Test-Case.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			Row row = sheet.getRow(1);
			Cell cell = row.getCell(0);
			
			System.out.println(cell);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*String browserType = "chrome";

		if (browserType.equalsIgnoreCase("Chrome")) {
			System.setProperty("windows.chrome.driver", "C://WebDrivers//chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			String URL = "https://demo.guru99.com/Agile_Project/Agi_V1/";
			driver.get(URL);

			driver.manage().window().maximize();

			LoginTest login = new LoginTest();
			CustomerTest customerTest = new CustomerTest();

			login.testLogin(driver);
			customerTest.generateMiniStatement(driver);

			driver.quit();
		} else if (browserType.equalsIgnoreCase("firefox")) {
			System.setProperty("windows.firefox.driver", "C://WebDrivers//geckodriver.exe");

			WebDriver driver = new FirefoxDriver();

			String URL = "https://demo.guru99.com/Agile_Project/Agi_V1/";
			driver.get(URL);

			driver.manage().window().maximize();

			LoginTest login = new LoginTest();
			CustomerTest customerTest = new CustomerTest();

			login.testLogin(driver);
			customerTest.generateMiniStatement(driver);

			driver.quit();
		}*/

	}

}

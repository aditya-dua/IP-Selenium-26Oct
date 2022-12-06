import org.testng.annotations.Test;

public class NewTest {
	

	
	
  @Test(description = "This test case is to test the login on the app.",priority = 10,enabled = true)
  public void f() {
	 System.out.println("My first test annotation!");
	  
  }
  
  @Test(description = "Launching the browser.")
  public void launchGoogle() {
	  // Using Selenium 
	  /**
	   * 1. Driver Object
	   * 2. Launch the Driver
	   * 
	   * 
	   * 
	   */
  }
}

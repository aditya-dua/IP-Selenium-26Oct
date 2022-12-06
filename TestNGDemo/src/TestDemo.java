import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestDemo {
  
	@Test
  public void f() {
		
		System.out.println("Test");
  }
  
	/*
	 * We have set some properties...set the driver connection
	 */
@BeforeTest
  public void beforeTest() {
	  System.out.println("Before");
  }

/*
 * close a connection
 * close my driver
 */
  @AfterTest
  public void afterTest() {
	  System.out.println("After");
  }

}

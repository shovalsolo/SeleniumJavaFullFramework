/* 
 * This class is running the test and using the webdriver from DriverInit class
 */

package singletoneWebDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		DriverInit instanceDriver = DriverInit.getInstance();
		driver = instanceDriver.openBrowser();
	}

	@Test
	public void testMethod()  {
		try {
			driver.get("https://www.google.com");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}
}

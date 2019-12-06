/* 
 * This class is running the test and using the webdriver from DriverInit class
 */

package singletoneWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import UniversalWebDriver.Driver;

public class PageTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		DriverInit instanceDriver = DriverInit.getInstance();
		driver = instanceDriver.openBrowser("firef");
	}

	@Test
	public void testMethod()  {
		try {
			driver.get("https://opensource-demo.orangehrmlive.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");		//Sending keys to field
			
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");	//Sending keys to field
			
			driver.findElement(By.xpath("//input[@id='btnLogin']")).sendKeys(Keys.RETURN);		//Clicking on the button
			Thread.sleep(2000);
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

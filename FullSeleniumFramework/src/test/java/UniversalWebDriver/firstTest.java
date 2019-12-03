/* 
 * This is test is using the following classes:
 * 1. Driver - To Initialize the webdriver and to close it
 * 2. Configuration - To set parameters like the browser and the URL link
 * 3. TestBase - To run the before and after class Initialize and close
 */

package UniversalWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class firstTest extends TestBase {
	
																								//@beforeClass is called in TestBase class and Initializing the driver
	
	@Test
	public void test1() throws Exception {
		Driver.Instance.navigate().to(Configuration.url.app_url);								//Navigating to url
		Thread.sleep(5000);
		
		Driver.Instance.findElement(By.name("txtUsername")).sendKeys("Admin");					//Sending keys to field
		Thread.sleep(2000);
		
		Driver.Instance.findElement(By.name("txtPassword")).sendKeys("admin123");				//Sending keys to field
		Thread.sleep(2000);
		
		Driver.Instance.findElement(By.xpath("//*[@id=\"btnLogin\"]")).sendKeys(Keys.RETURN);	//Clicking on the button
		Thread.sleep(5000);
	}
	

}

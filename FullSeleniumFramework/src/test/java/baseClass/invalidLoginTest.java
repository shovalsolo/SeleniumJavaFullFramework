/* 
 * A class that will extend the base class
 * Extending a class will execute the file the is extending
 * 
 */

package baseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import UniversalWebDriver.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class invalidLoginTest extends baseClass {
	
	@Test(description="This TC will perform an invalid login")
	public void loginToApplication() throws Exception {

		Reporter.log("=======Click on login Started=======",true);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");						//

		driver.findElement(By.name("txtUsername")).sendKeys("Admin1");					//Sending keys to field

		driver.findElement(By.name("txtPassword")).sendKeys("admin123");				//Sending keys to field
		Thread.sleep(2000);																//

		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).sendKeys(Keys.RETURN);	//Clicking on the button
		Thread.sleep(5000);																//
		
		Reporter.log("=======Click on login End=======",true);
	}
	
	@Test(description="This TC will perform an invalid login")
	public void loginToApplication1() throws Exception {

		Reporter.log("=======Click on login Started=======",true);

		driver.findElement(By.name("txtUsername")).sendKeys("Admin2");					//Sending keys to field

		driver.findElement(By.name("txtPassword")).sendKeys("admin123");				//Sending keys to field
		Thread.sleep(2000);																//

		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).sendKeys(Keys.RETURN);	//Clicking on the button
		Thread.sleep(5000);																//
		
		Reporter.log("=======Click on login End=======",true);
	}
}

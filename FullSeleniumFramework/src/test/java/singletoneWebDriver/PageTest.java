/* 
 * This class is running the test and using the webdriver from DriverInit class singleton pattern 
 */

package singletoneWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import UniversalWebDriver.Driver;

public class PageTest {

	WebDriver driver;

	@BeforeClass																			//This will run before the class
	public void setUp() {																	//Function that is calling the driver init
		Reporter.log("=======setUp Started=======",true);
		DriverInit instanceDriver = DriverInit.getInstance();								//Creating an object of the "instanceDriver" from class "DriverInit"
		driver = instanceDriver.openBrowser("chrome");										//Setting the browser selected and calling the function from the 
		Reporter.log("=======setUp Ended=======",true);
	}
	
	
	@Test
	public void testMethod()  {																//Login method
		try {
			Reporter.log("=======Login Started=======",true);
			driver.get("https://opensource-demo.orangehrmlive.com/");
			Thread.sleep(2000);																//Wait to see the results
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");	//Sending keys to field
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");//Sending keys to field
			driver.findElement(By.xpath("//input[@id='btnLogin']")).sendKeys(Keys.RETURN);	//Clicking on the button
			Thread.sleep(2000);																//Wait to see the results
			Reporter.log("=======Login Ended=======",true);
		} 
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());								//Message of the exception
			System.out.println("Cause is " + e.getCause());									//Cause of the exception
		}
	}
	
	@AfterClass																				//This will run after the class
	public void tearDown() {																//Function to close the browser
		Reporter.log("=======tearDown Started=======",true);
		driver.close();																		//Closing the browser
		driver.quit();																		//Closing the process 
		System.out.println("Test completed successfully");									//Printing message
		Reporter.log("=======tearDown Ended=======",true);
	}
}

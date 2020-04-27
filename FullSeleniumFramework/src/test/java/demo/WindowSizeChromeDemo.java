/* 
 * Chrome window-size browser the option to control Arguments in the browser
 */

package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import screenShotPrintScreen.ScreenshotManager;

public class WindowSizeChromeDemo {

	public static WebDriver driver = null;

	@BeforeClass																			//This will run before the class
	public void setUp() {																	//Function that is calling the driver init
		try {
			Reporter.log("=======setUp Started=======",true);
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();									//Creating an object of ChromeOptions						$$$
			options.addArguments("window-size=1080,750");									//Setting the argument for window-size to options object	$$$
			driver = new ChromeDriver(options);												//Passing the options object the the ChromeDriver			$$$								//Setting the browser selected and calling the function from the 
			Reporter.log("=======setUp Ended=======",true);
		} 
		catch (Exception e) {
			Reporter.log("=======setUp Failed=======",true);
			ScreenshotManager.cuptureScreenshot(driver , "setUp-Failed");
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());								//Message of the exception
			System.out.println("Cause is " + e.getCause());									//Cause of the exception
		}
	}
	
	@Test(priority = 1)
	public static void login() {
			
		
		try {
			driver.get("https://opensource-demo.orangehrmlive.com/");
			System.out.println(driver.getTitle());											//Will print the title of the page
			Thread.sleep(2000);																//Wait to see the results
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");	//Sending keys to field
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");//Sending keys to field
			driver.findElement(By.xpath("//input[@id='btnLogin']")).sendKeys(Keys.RETURN);	//Clicking on the button
			Thread.sleep(5000);
			Reporter.log("=======Login Ended=======",true);
		} 
		catch (InterruptedException e) {
			Reporter.log("=======login Failed=======",true);
			ScreenshotManager.cuptureScreenshot(driver , "login-Failed");
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());								//Message of the exception
			System.out.println("Cause is " + e.getCause());
		}																
	}
	
	
	@AfterClass																				//This will run after the class
	public void tearDown() {																//Function to close the browser
		try {
			Reporter.log("=======tearDown Started=======",true);
			driver.close();																	//Closing the browser
			driver.quit();																	//Closing the process 
			System.out.println("Test completed successfully");								//Printing message
			Reporter.log("=======tearDown Ended=======",true);
		} 
		catch (Exception e) {
			Reporter.log("=======tearDown Failed=======",true);
			ScreenshotManager.cuptureScreenshot(driver , "tearDown-Failed");
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());								//Message of the exception
			System.out.println("Cause is " + e.getCause());									//Cause of the exception
		}
	}
	
	
}

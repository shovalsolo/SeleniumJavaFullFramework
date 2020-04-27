/* 
 * This Class is 
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

public class TestShowcaseDesignersSite {
	
	public static WebDriver driver = null;

	@BeforeClass																			//This will run before the class
	public void setUp() {																	//Function that is calling the driver init
		try {
			Reporter.log("=======setUp Started=======",true);
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();									//Creating an object of ChromeOptions						$$$
			options.addArguments("window-size=1080,720");									//Setting the argument for window-size to options object	$$$
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
	public static void openUrl() {
			
		try {
			Reporter.log("=======openUrl Started=======",true);
			driver.get("http://localhost:8181/Design/");									//Navigate to url
			System.out.println(driver.getTitle());											//Will print the title of the page
			Thread.sleep(5000);
			Reporter.log("=======openUrl Ended=======",true);
		} 
		catch (InterruptedException e) {
			Reporter.log("=======openUrl Failed=======",true);
			ScreenshotManager.cuptureScreenshot(driver , "openUrl-Failed");
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());								//Message of the exception
			System.out.println("Cause is " + e.getCause());
		}																
	}
	
	@Test(priority = 2)
	public static void clickOnShowcase() {
			
		try {
			Reporter.log("=======clickOnShowcase Started=======",true);															//Wait to see the results
			driver.findElement(By.xpath("//a[contains(text(),'Showcase')]")).click();		//Sending keys to field
			Thread.sleep(5000);
			Reporter.log("=======clickOnShowcase Ended=======",true);
		} 
		catch (InterruptedException e) {
			Reporter.log("=======clickOnShowcase Failed=======",true);
			ScreenshotManager.cuptureScreenshot(driver , "clickOnShowcase-Failed");
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());								//Message of the exception
			System.out.println("Cause is " + e.getCause());
		}																
	}
	
	@Test(priority = 3)
	public static void clickOnServices() {
			
		try {
			Reporter.log("=======clickOnServices Started=======",true);
			driver.findElement(By.xpath("//a[contains(text(),'Services')]")).click();		//Sending keys to field
			Thread.sleep(5000);
			Reporter.log("=======clickOnServices Ended=======",true);
		} 
		catch (InterruptedException e) {
			Reporter.log("=======clickOnServices Failed=======",true);
			ScreenshotManager.cuptureScreenshot(driver , "clickOnServices-Failed");
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());								//Message of the exception
			System.out.println("Cause is " + e.getCause());
		}																
	}
	
	@Test(priority = 4)
	public static void clickOnDesigners() {
			
		try {
			Reporter.log("=======clickSDesigners Started=======",true);
			driver.findElement(By.xpath("//a[contains(text(),'Designers')]")).click();		//Sending keys to field
			Thread.sleep(5000);
			Reporter.log("=======clickOnDesigners Ended=======",true);
		} 
		catch (InterruptedException e) {
			Reporter.log("=======clickOnDesigners Failed=======",true);
			ScreenshotManager.cuptureScreenshot(driver , "clickOnDesigners-Failed");
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());								//Message of the exception
			System.out.println("Cause is " + e.getCause());
		}																
	}
	
	@Test(priority = 5)
	public static void clickOnPackages() {
			
		try {
			Reporter.log("=======clickOnPackages Started=======",true);
			driver.findElement(By.xpath("//a[contains(text(),'Packages')]")).click();		//Sending keys to field
			Thread.sleep(5000);
			Reporter.log("=======clickOnPackages Ended=======",true);
		} 
		catch (InterruptedException e) {
			Reporter.log("=======clickOnPackages Failed=======",true);
			ScreenshotManager.cuptureScreenshot(driver , "clickOnPackages-Failed");
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());								//Message of the exception
			System.out.println("Cause is " + e.getCause());
		}																
	}
	
	@Test(priority = 6)
	public static void clickOnContact() {
			
		try {
			Reporter.log("=======clickOnContact Started=======",true);
			driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();		//Sending keys to field
			Thread.sleep(5000);
			Reporter.log("=======clickOnContact Ended=======",true);
		} 
		catch (InterruptedException e) {
			Reporter.log("=======clickOnContact Failed=======",true);
			ScreenshotManager.cuptureScreenshot(driver , "clickOnContact-Failed");
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

/* 
 * This is a demo test to show about TestNG annotations 
 * @BeforeTest - Will run once before each test
 * @Test - Will run once
 * @AfterTest - Will run once after each test
 * 
 * assertEquals - Verify actual and expected values are equal
 * assertTrue - Verify a condition is true
 * 
 * Public - is an access modifier it can be access by other singed classes
 * Void - means that the method does not return a value
 * Method with empty () - means that it does not receives parameters 
 * Private - means it cannot be access by other singed classes
 * Static - 
 */

package buildingBlocks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Search_T_SHIRTS_TestNG {

	WebDriver driver;
	
	public static void main(String[] args) {
	}
	
	@BeforeTest
	public void setUp()																	//Setup of chrome driver and opening URL
	{
		String projectPath = System.getProperty("user.dir");							// creating a parameter of the path to the chrome driver
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");//the location of the chrome driver
		driver = new ChromeDriver();												
		driver.get("http://automationpractice.com/index.php");							// Navigating to URL
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);				//Setting timer to 10 seconds
	}
	
	@Test
	public void automationSignIn()														//Login to site
	{
		try {
			driver.findElement(By.linkText("Sign in")).click();							//Find by link text //Click on Sign in
			
			driver.findElement(By.id("email")).sendKeys("Selenium@Automation.com");		//Find by id //Send Keys to email field
			
			driver.findElement(By.name("passwd")).sendKeys("SeleniumAutomation1234");	//Find by name //Send Keys to password field
			
			driver.findElement(By.cssSelector("#SubmitLogin")).click();					//Find by css Selector  Rclick and copy selector //Click on Login button
		} 
		catch (Exception e) {															//Catch block for errors
			System.out.println("Test automationSignIn failed");
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		
		try {
			String actualUser=driver.findElement(By.linkText("Selenium Automation")).getText();	//Getting the text from the element and will assign it to a string
			String expectedUser = "selenium automation";								//Saving the expected user to be login
			
			Assert.assertTrue(actualUser.equalsIgnoreCase(expectedUser));				//Checking if actualUser is equals to expectedUser
		} 
		catch (Exception e) {
			System.out.println("Test Checking actual User failed");
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	@Test
	public void search_T_Shirts()															//Searching for Orange T Shirts
	{
		try {
			//Click on Login SHIRTS
			driver.findElement(By.partialLinkText("SHIRTS")).click();						//Can use to search only a part of the link text
			
			//Send Keys to search field
			driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("Orange");//Can use to search only a part of the link text
			
			//Click on search 
			driver.findElement(By.xpath("*//*[@type='submit']")).click();					//Can use to search only a part of the link text - Rclick and copy xpath selector
		} 
		catch (Exception e) {																//Catch block for errors
			System.out.println("Test search_T_Shirts");
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		
		try {																									//Validating that the searched color is orange 
			String actualColor=driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span[1]")).getText();	//Saving the element with getText
			String expectedlColor="\"ORANGE\"";																	//Have to use "\"string\"" to get """" on the string
			Assert.assertEquals(actualColor,expectedlColor , "The Actual and Expected colors Do Not Match");	//Checking if actualUser is equals to expectedUser
		} 
		catch (Exception e) {
			System.out.println("Test Checking actual Color failed");
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	@Test
	public void signOut()																	//Sign Out from user
	{
		try { 
			driver.findElement(By.className("logout")).click();								//Can use to search only a part of the link text //Click on logout
			Thread.sleep(5000);
		} 
		catch (Exception e) {																//Catch block for errors
			System.out.println("Test signOut failed");
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	@AfterTest
	public void tearDown()																		//Tear Down to close browser and process
	{
		try {
			driver.close();																		//Close the window
			driver.quit();																		//Close the Chrome process		
		} 
		catch (Exception e) {
			System.out.println("Test tearDown failed");
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
}

/* 
 * This is a demo test to show about TestNG annotations 
 * @BeforeTest - Will run once before each test
 * @Test - Will run once
 * @AfterTest - Will run once after each test
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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Search_T_SHIRTS_TestNG {

	WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@BeforeTest
	public void setUp()
	{
		String projectPath = System.getProperty("user.dir");							// creating a parameter of the path to the chrome driver
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");//the location of the chrome driver
		driver = new ChromeDriver();												
		driver.get("http://automationpractice.com/index.php");							// Navigating to URL
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);				//Setting timer to 10 seconds
	}
	
	@Test
	public void automationSignIn()
	{
		try {
			//Click on Sign in
			driver.findElement(By.linkText("Sign in")).click();							//Find by link text
			Thread.sleep(1000);
			
			//Send Keys to email field
			driver.findElement(By.id("email")).sendKeys("Selenium@Automation.com");		//Find by id
			Thread.sleep(1000);
			
			//Send Keys to password field
			driver.findElement(By.name("passwd")).sendKeys("SeleniumAutomation1234");	//Find by name
			Thread.sleep(1000);
			
			//Click on Login button
			driver.findElement(By.cssSelector("#SubmitLogin")).click();					//Find by css Selector  Rclick and copy selector
			Thread.sleep(1000);
		} 
		catch (Exception e) {															//Catch block for errors
			System.out.println("Test automationSignIn");
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	@Test
	public void search_T_Shirts()
	{
		try {
			//Click on Login SHIRTS
			driver.findElement(By.partialLinkText("SHIRTS")).click();						//Can use to search only a part of the link text
			Thread.sleep(1000);
			
			//Send Keys to search field
			driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("Orange");//Can use to search only a part of the link text
			Thread.sleep(1000);
			
			//Click on search 
			driver.findElement(By.xpath("*//*[@type='submit']")).click();					//Can use to search only a part of the link text - Rclick and copy xpath selector
			Thread.sleep(1000);
		} 
		catch (Exception e) {																//Catch block for errors
			System.out.println("Test search_T_Shirts");
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	@Test
	public void signOut()
	{
		try {
			//Click on logout 
			driver.findElement(By.className("logout")).click();								//Can use to search only a part of the link text
			Thread.sleep(5000);
		} 
		catch (Exception e) {																//Catch block for errors
			System.out.println("Test search_T_Shirts");
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();																		//Close the window
		driver.quit();																		//Close the Chrome process
	}

}

/* 
 * Class that is helping  googleSearchWithTestNG sending input from googleSearchWithTestNG to googleSearchWithTestNGPage using TestNG to run the test  %%% for impotent
 * 
 * To run this file need to run testng.xml
 * 
 */

package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.googleSearchWithTestNGPage;

public class googleSearchWithTestNG {
	
	static WebDriver driver = null;													//Creating a new driver
	
	@BeforeTest																		//TestNG before test method will run before all
	public static void setUPTest() { 												//Setup method that is setting up the chrome driver	%%%

		WebDriverManager.chromedriver().setup();									//Initializing the webdriver
		
		driver = new ChromeDriver();
	}
	
	@Test																			//TestNG before test method							%%%
	public void googleSearchTest() {												//A method that has all the test steps
		
		driver.get("https://google.com/"); 	
		
		googleSearchWithTestNGPage.textbox_search(driver).sendKeys("TestNG wiki");	//Calling an object from the page class to send the text to the search field
		
		googleSearchWithTestNGPage.button_click(driver).sendKeys(Keys.RETURN);		//Calling an object from the page class to click the button
	}
	
	@AfterTest																		//TestNG before test method will run last			%%%
	public void tearDownTest() {
		
		driver.close();																//Closing the browser

		driver.quit();																//Stopping the process
		
		System.out.println("Test completed Successfully ");							//Print message
	}
}

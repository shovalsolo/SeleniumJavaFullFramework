/* 
 * Class that is helping  googleSearchWithTestNG sending input from googleSearchWithTestNG to googleSearchWithTestNGPage using TestNG to run the test  %%% for impotent
 * 
 *  This class is using Class PropertiesFile that is reading from "config.properties" that is holding the parameters for the test 
 *  
 *  To run this file need to run testng.xml
 */

package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;
import demo.Log4jDemo;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.googleSearchWithTestNGPage;

public class googleSearchWithTestNG2 {
	
	static WebDriver driver = null;													//Creating a new driver
	public static String browserName=null;											//Setting the parameter to be public that other classes can use too %%%
	private static Logger logger = LogManager.getLogger(Log4jDemo.class);			//Creating a logger parameter	%%%
	
	@BeforeTest																		//TestNG before test method will run before all
	public static void setUPTest() { 												//Setup method that is setting up the chrome driver	%%%
		
		PropertiesFile.getProperties();												//Will call the getProperties function in PropertiesFile class to get the browser that is configured	%%%
		
		if (browserName.equalsIgnoreCase("chrome")) {								//If parameter in "config.properties" is chrome will run this
			
			WebDriverManager.chromedriver().setup();								//Initializing the webdriver for chrome
			driver = new ChromeDriver();											//Setting driver to chrome
		}
		else if (browserName.equalsIgnoreCase("firefox")) {							//If parameter in "config.properties" is firefox will run this
			WebDriverManager.firefoxdriver().setup();								//Initializing the webdriver for firefox
			driver = new FirefoxDriver();											//Setting driver to firefox
		}

	}
	
	@Test																			//TestNG before test method							%%%
	public void googleSearchTest() {												//A method that has all the test steps
		
		driver.get("https://google.com/"); 	
		
		googleSearchWithTestNGPage.textbox_search(driver).sendKeys("TestNG wiki");	//Calling an object from the page class to send the text to the search field
		
		googleSearchWithTestNGPage.button_click(driver).sendKeys(Keys.RETURN);		//Calling an object from the page class to click the button
		
		logger.info("This is an information message from googleSearchTest");		//Will not be logged in the console
	}
	
	@Test																			//TestNG before test method							%%%
	public void googleSearchTest1() {												//A method that has all the test steps
		
		driver.get("https://google.com/"); 	
		
		googleSearchWithTestNGPage.textbox_search(driver).sendKeys("wiki wiki");	//Calling an object from the page class to send the text to the search field
		
		googleSearchWithTestNGPage.button_click(driver).sendKeys(Keys.RETURN);		//Calling an object from the page class to click the button
	}
	
	
	@AfterTest																		//TestNG before test method will run last			%%%
	public void tearDownTest() {
		
		driver.close();																//Closing the browser

		//driver.quit();															//Stopping the process
		
		System.out.println("Test completed Successfully ");							//Print message
	}
}

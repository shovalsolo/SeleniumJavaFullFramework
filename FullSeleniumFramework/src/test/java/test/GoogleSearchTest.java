/* 
 * Class that is helping  GoogleSearchTest sending input from GoogleSearchTest to GoogleSearchPageObjects
 */


package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObjects;

public class GoogleSearchTest {
	
	//private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		googleSearchTest();																//calling the function googleSearchTest
		
	}
	
	public static void googleSearchTest() { 											//Function googleSearchTest that is navigating to google and searching
		
		WebDriverManager.chromedriver().setup();										//Initializing the webdriver
		WebDriver driver = new ChromeDriver();											//Creating a new driver
		
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);	//Creating an object from class GoogleSearchPageObjects that has the functions
		driver.get("https://google.com");												//Navigating to google
		searchPageObj.setTextInSearchBox("Ethical hacking training toronto");			//Using the object to call a function to set the text to the search field
		searchPageObj.ClickSearchButton();												//Using the object to call a function to Click the search button
		driver.close();																	//Closing the browser window
		driver.quit();																	//Closing the chromedriver process
		
	}

}

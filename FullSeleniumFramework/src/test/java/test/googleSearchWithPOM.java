/* 
 * Class that is using googleSearchWithPOMpage sending input from googleSearchWithPOM to googleSearchWithPOMpage
 */

package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.googleSearchWithPOMpage; 																				//Importing the class with the functions for this test

public class googleSearchWithPOM {

	private static WebDriver driver = null;

	public static void main(String[] args) { 																		// Main

		googleSearch(); 																							// Calling the function

	}

	public static void googleSearch() {

		String projectPath = System.getProperty("user.dir"); 														// creating a parameter of the path to the chrome driver

		System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver\\chromedriver.exe"); 	// the location of the driver

		driver = new ChromeDriver(); 																				// Creating an object of driver

		// Go to Google

		driver.get("https://google.com/"); 																			// Navigating to URL

		// Enter text in search box
		// driver.findElement(By.name("q")).sendKeys("Automation test"); 											// Navigating to URL not with POM

		googleSearchWithPOMpage.textbox_search(driver).sendKeys("Automation test");

		// Click on search button
		// driver.findElement(By.name("q")).sendKeys(Keys.RETURN); 													//Clicking on search button not with POM

		googleSearchWithPOMpage.button_search(driver).sendKeys(Keys.RETURN);

		driver.close();

		driver.quit();

		System.out.println("Test completed Successfully ");
	}

}

/* 
 * Class that is helping  googleSearchWithTestN sending input from googleSearchWithTestN to googleSearchWithTestNGPage using TestNG to run the test
 */

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class googleSearchWithTestNGPage {
	
	private static WebElement element = null;
	
	public static WebElement textbox_search(WebDriver driver) {		// A function from type WebElement that is getting a web driver
		
		element = driver.findElement(By.name("q"));					// A WebElement that is holding the location of field
		
		return element;												// Returning an element back
		
	}
	
	public static WebElement button_click(WebDriver driver) {		// A function from type WebElement that is getting a web driver
		
		element = driver.findElement(By.name("q"));					// A WebElement that is holding the location of field
		
		return element;
		
	}

}

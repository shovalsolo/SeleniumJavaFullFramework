/* 
 * Class that is helping  googleSearchWithPOM sending input from googleSearchWithPOM to googleSearchWithPOMpage
 */

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class googleSearchWithPOMpage {
	
	private static WebElement element = null;
	
	public static WebElement textbox_search(WebDriver driver) {		// A function from type WebElement that is getting a web driver
		
		element = driver.findElement(By.name("q"));					// A WebElement that is holding the location of field
		
		return element;												// Returning an element back
		
	}
	
	public static WebElement button_search(WebDriver driver) {		// A function from type WebElement that is getting a web driver
		
		element = driver.findElement(By.name("q"));					// A WebElement that is holding the location of field
		
		return element;
		
	}

}

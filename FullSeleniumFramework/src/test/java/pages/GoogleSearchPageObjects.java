/* 
 * Class that is helping  GoogleSearchTest sending input from GoogleSearchTest to GoogleSearchPageObjects
 */

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	
	WebDriver driver = null;
	
	By textbox_search = By.name("q");								//Locating the element and saving to param
	
	By button_search = By.name("q");								//Locating the element and saving to param
	
	public GoogleSearchPageObjects(WebDriver driver) {				//A constructor that is getting the driver object and setting it
		this.driver = driver;										//Setting the driver object
	}
	
	public void setTextInSearchBox(String text) {					//A function to set the text in the search field this function is getting a string
		driver.findElement(textbox_search).sendKeys(text);			//Using the driver to find the element and setting the keys to the field
	}
	
	public void ClickSearchButton() {								//A function to Click the search button
		driver.findElement(button_search).sendKeys(Keys.RETURN);	//Using the driver to find the element and click the button
	}
}

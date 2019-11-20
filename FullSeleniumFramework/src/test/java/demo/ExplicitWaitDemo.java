/* 
 * Explicit Wait is applicable specific elements
 * Explicit Wait can be set for a specific condition
 * 
 */

package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitDemo {
	
	public static WebDriver driver = null;
	
	public static void main(String[] args) {
		seleniumWaits();
	}
	
	public static void seleniumWaits() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
				
		driver.get("https://google.com");									//Navigate to url					
		driver.findElement(By.name("q")).sendKeys("Automation test");		//Sending keys to field
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);				//Sending Enter key
		
		WebDriverWait wait = new WebDriverWait(driver , 10);				//Setting time out in seconds %%%
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd")));	//Will wait 10 seconds to have this element "abcd" before giving an exception %%%
		
		driver.findElement(By.name("abcd")).click();						//Will fail after searching an object that does not exist on the page
		
		driver.close();
		driver.quit();
		
	}

}

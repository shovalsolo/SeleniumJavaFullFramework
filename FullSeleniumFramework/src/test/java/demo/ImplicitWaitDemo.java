/* 
 * Implicit Wait is applicable for the entire session of the browser
 * Implicit Wait is used to define a time unit when the webdriver should wait before throwing "No such Element" Exception
 * 
 * You can set is in the beginning of the function and it will be applicable for the entire session of the test
 * Default pull time of Implicit Wait is 250 ms
 */

package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitDemo {
	
	public static WebDriver driver = null;
	
	public static void main(String[] args) {
		seleniumWaits();
	}
	
	public static void seleniumWaits() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	//A wait that will wait 10 seconds the default is zero and is applicable for the entire session
		
		driver.get("https://google.com");									//Navigate to url					
		driver.findElement(By.name("q")).sendKeys("Automation test");		//Sending keys to field
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);				//Sending keys to field
																			//The Implicit Wait will wait here even if it is set in the beginning 
		driver.findElement(By.name("abcd")).click();						//Will fail after searching an object that does not exist on the page
		
		driver.close();
		driver.quit();
		
	}

}

/* 
 * Fluent Wait is a wait to specific element 
 * Setting max wait time period
 * setting polling frequency
 * Setting to ignore specific exceptions
 */

package demo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;
import com.google.common.base.Function;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitDemo {
	
	public static WebDriver driver = null;
	
	@Test
	public void test() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://google.com");											//Navigate to url					
		driver.findElement(By.name("q")).sendKeys("Abcd");							//Sending keys to field
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);						//Sending Enter key
		//driver.findElement(By.xpath("//span[contains(text(),'ABCD Canada | Home - Deepening Community')]")).click();
		
		
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)					//Creating an instance for fluent wait		%%%				
				.withTimeout(30, TimeUnit.SECONDS) 									//Setting time out at 30 seconds			%%%
				.pollingEvery(2, TimeUnit.SECONDS) 									//Setting polling time to 3 seconds			%%%
				.ignoring(NoSuchElementException.class);							//Ignoring the NoSuchElementException		%%%
		
		WebElement element = wait.until(new Function<WebDriver ,WebElement>(){		//Creating an instance that is holding the wait instance	%%%
			public WebElement apply(WebDriver driver) {								//Function that is getting the Webdriver	%%%
				WebElement linkElement =  driver.findElement(By.xpath("//span[contains(text(),'ABasdasdsadsa')]"));	//Saving the Xpath for the element we are looking	%%%
				if (linkElement.isEnabled()) {										//Checking if element was found	%%%
					System.out.println("Element Found");							//Printing a message the the element was found in the page	%%%
				}
				else {
					System.out.println("Element was not Found");					//Waiting 30 seconds before Printing a message the the element was found in the page	%%%
				}
				return linkElement;													//Returning the instance with the answer 	%%%
			}
		});
		
		element.click();															//Clicking on the element with the link	%%%
		
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}
}

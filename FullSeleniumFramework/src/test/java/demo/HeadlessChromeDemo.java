/* 
 * Chrome headless browser the option to run the browser in the background
 */

package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessChromeDemo {

	public static WebDriver driver = null;

	@Test
	public static void test() {

		WebDriverManager.chromedriver().setup();

		
		ChromeOptions options = new ChromeOptions();								//Creating an object of ChromeOptions								$$$
		options.addArguments("--headless");											//Setting the argument for headless browser to options object		$$$

	
		driver = new ChromeDriver(options);											//Passing the options object the the ChromeDriver
		driver.get("https://google.com");											//Navigate to url
		System.out.println(driver.getTitle());										//Will print the title of the page
		driver.findElement(By.name("q")).sendKeys("Solotech");						//Sending keys to field
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);						//Sending Enter key

		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}

}

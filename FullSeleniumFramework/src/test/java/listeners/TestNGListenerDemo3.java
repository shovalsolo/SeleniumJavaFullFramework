/* 
 * This is a class that is calling the listeners from "TestNGListeneres" and is being run from "testng1.xml"
 */

package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TestNGListenerDemo3 {
	
	@Test													//
	public void test4() {
		System.out.println("Hi from Test 4");				//This test will pass and will show message from listener
	}
	
	@Test													//
	public void test5() {
		System.out.println("Hi from Test 5");				//
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");													//Navigating to google

		driver.findElement(By.name("q")).sendKeys("ExtentReports");							//Sending text to text field

		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);								//Clicking on search button
		
		driver.close();
		
		driver.quit();
		
	}
	
	@Test													//
	public void test6() {
		System.out.println("Hi from Test 6");				//
		throw new SkipException("This test is skipped");	//Skip the test
	}

}

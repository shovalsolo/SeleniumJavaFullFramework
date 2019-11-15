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

public class TestNGListenerDemo2 {
	
	@Test													//
	public void test1() {
		System.out.println("Hi from Test 1");				//This test will pass and will show message from listener
	}
	
	@Test													//
	public void test2() {
		System.out.println("Hi from Test 2");				//
		System.out.println("Hi from Test 5");				//
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");													//Navigating to google

		driver.findElement(By.name("www")).sendKeys("ExtentReports");							//Sending text to text field

		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);								//Clicking on search button
		
		driver.close();
		
		driver.quit();
		
	}
	
	@Test													//
	public void test3() {
		System.out.println("Hi from Test 3");				//
		throw new SkipException("This test is skipped");	//Skip the test
	}

}

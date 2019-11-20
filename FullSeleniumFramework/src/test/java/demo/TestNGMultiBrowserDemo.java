/* 
 * Will run browser according to the testNG parameters -- To run this file need to run testng3.xml
 */

package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGMultiBrowserDemo {
	
	WebDriver driver = null;

	@Parameters("browserName")
	@BeforeTest
	public void setUp(String browserName) {
		
		System.out.println("Browser name is:   "+ browserName);
		System.out.println("Thread ID is  :"+Thread.currentThread().getId()+ " Browser name  :" + browserName);
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
	}

	@Test
	public void test1() throws Exception {
		driver.get("https://google.com/");																	// Navigating to URL
		
		//Enter text in search box
		driver.findElement(By.name("q")).sendKeys("Automation test");										// Sending keys to field
		
		Thread.sleep(4000);
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}
}

/* 
 * A class run everything from inside the class will not use any other classes
 */

package baseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import UniversalWebDriver.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest {
	
	WebDriver driver;

	@BeforeMethod
	public void setupApplication() {
		Reporter.log("=======Setup browser Started=======",true);
		WebDriverManager.chromedriver().setup();										//
		driver = new ChromeDriver();													//
		Reporter.log("=======Setup browser End=======",true);
	}

	@Test
	public void loginToApplication() throws Exception {

		Reporter.log("=======Click on login Started=======",true);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");						//

		driver.findElement(By.name("txtUsername")).sendKeys("Admin");					//Sending keys to field

		driver.findElement(By.name("txtPassword")).sendKeys("admin123");				//Sending keys to field
		Thread.sleep(2000);																//

		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).sendKeys(Keys.RETURN);	//Clicking on the button
		Thread.sleep(5000);																//
		
		Reporter.log("=======Click on login End=======",true);
	}

	@AfterMethod
	public void CloseApplication() {
		Reporter.log("=======Closing Browser Session started=======",true);
		
		driver.close();
		driver.quit();
		
		Reporter.log("=======Closing Browser Session End=======",true);
	}
}

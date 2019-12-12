/* 
 * This class is taking a screen shot on failure using class ScreenshotManager.cuptureScreenshot
 */

package screenShotPrintScreen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotOnFailure {
	
	static WebDriver driver =  null;
	
	@Test
	public void ScreenshotOnMethodFailure() {
		
		WebDriverManager.chromedriver().setup();						//Setting ChromeDriver
		driver = new ChromeDriver();									//Setting browser as Chrome
		driver.get("https://opensource-demo.orangehrmlive.com/");		//Going to URL
		
		driver.findElement(By.id("txtUsername11")).sendKeys("11111");	//This will fail and will go to @AfterMethod and will take the screenshot with the class name as the picture file name
	}
	
	@AfterMethod														//Will run after every function %%%
	public void tearDown(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus()) {
			ScreenshotManager.cuptureScreenshot(driver , result.getName());	// %%% This is calling ScreenshotManager.cuptureScreenshot with file name and the WebDriver to get a screenshot
		}
		driver.quit();
}

/* 
 * This is a demo test to show all find element ways
 */
package buildingBlocks;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Search_T_SHIRTS {
	
	static WebDriver driver = null;

	public static void main(String[] args) {
		
		try {
			String projectPath = System.getProperty("user.dir");						// creating a parameter of the path to the chrome driver
			
			System.out.println("projectPath : " + projectPath);
			
			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");//the location of the chrome driver
			
			driver = new ChromeDriver();												
			
			driver.get("http://automationpractice.com/index.php");						// Navigating to URL
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			//Setting timer to 10 seconds
			
			driver.findElement(By.linkText("Sign in")).click();							//Find by link text
			Thread.sleep(5000);
			
			driver.findElement(By.id("email")).sendKeys("Selenium@Automation.com");		//Find by id
			Thread.sleep(5000);
			
			driver.findElement(By.name("passwd")).sendKeys("SeleniumAutomation1234");	//Find by name
			Thread.sleep(5000);
			
			driver.findElement(By.cssSelector("#SubmitLogin")).click();					//Find by css Selector  Rclick and copy selector
			Thread.sleep(5000);
			
			driver.findElement(By.partialLinkText("SHIRTS")).click();					//Can use to search only a part of the link text
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("Orange");//Can use to search only a part of the link text
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("*//*[@type='submit']")).click();				//Can use to search only a part of the link text - Rclick and copy xpath selector
			Thread.sleep(5000);
			
			driver.findElement(By.className("logout")).click();							//Can use to search only a part of the link text
			Thread.sleep(5000);
			
		} catch (InterruptedException e) {
			
			System.out.println("Test Failed");
			e.printStackTrace();
			e.getMessage();
			e.getCause();
		}
		
		driver.close();																						//close the window
		driver.quit();
		
	}

}

package Browser;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

	public static void main(String[] args) {
		
		//Test on Firefox
		
		String projectPath = System.getProperty("user.dir");												// Creating a parameter of the path to the firefox driver
		
		System.out.println("projectPath is : " + projectPath);												// Printing the projectPath location
		
		System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/firefox/geckodriver.exe");		// The location of the driver
		
		WebDriver driver = new FirefoxDriver();																// Creating a webdriver object of FirefoxDriver
		
		driver.get("http://google.com/");																	// Navigating to URL
		
		driver.findElement(By.name("q")).sendKeys("Automation test");;										// Navigating to URL
		
		List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));
		
		int count =  listOfInputElements.size();
		
		System.out.println("Count of input elements on google page is :"+count);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);									//Setting timer to 10 seconds
		
		driver.close();																						//closing browser
		
		//Test on chrome
		
		projectPath = System.getProperty("user.dir");														// creating a parameter of the path to the chrome driver
		
		System.out.println("projectPath : " + projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");//the location of the chrome driver
		
		driver = new ChromeDriver();
		
		driver.get("http://google.com/");																// Navigating to URL
		
		WebElement textBox = driver.findElement(By.xpath("//input[@name='q']"));
		
		textBox.sendKeys("Automation test");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);									//Setting timer to 10 seconds
		
		driver.close();																						//close the window
		
		//Test on Internet explorer
		
//		projectPath = System.getProperty("user.dir");														// creating a parameter of the path to the chrome driver
//		
//		System.out.println("projectPath : " + projectPath);
//		
//		System.setProperty("webdriver.ie.driver", projectPath+"/drivers/iedriver/IEDriverServer.exe");	//the location of the chrome driver
//		
//		driver = new InternetExplorerDriver();
//		
//		driver.get("http://seleniumhq.org/");																// Navigating to URL
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);									//Setting timer to 10 seconds
//		
//		driver.close();																						//close the window
		driver.quit();	

	}

}

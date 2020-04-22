/* 
 * Using AutoIT to run a script to load file from windows desktop 
 * Script is located in C:\Users\Solomon\git\SeleniumJavaFullFramework\FullSeleniumFramework\AutoIT
 * Exe file is running to upload the file
 */
package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import screenShotPrintScreen.ScreenshotManager;

public class AutoITDemo {

	public static WebDriver driver = null;
	public static String projectPath = System.getProperty("user.dir");								// Creating a parameter of the path to the driver

	@Test
	public static void uploadFile() throws Exception {
		try {
			Reporter.log("=======Driver-setUp=======",true);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);						//Wait that will wait 10 seconds the default is zero and is applicable for the entire session
		} 
		catch (Exception e) {
			Reporter.log("=======Driver-setUp-Failed=======",true);
			ScreenshotManager.cuptureScreenshot(driver , "Driver-setUp-Failed");
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());										//Message of the exception
			System.out.println("Cause is " + e.getCause());		
		}

		try {
			Reporter.log("=======Navigate to url=======",true);
			driver.get("http://s000.tinyupload.com/index.php?");									//Navigate to url
			System.out.println(driver.getTitle());													//Will print the title of the page
		} 
		catch (Exception e) {
			Reporter.log("=======Navigate to url Failed=======",true);
			ScreenshotManager.cuptureScreenshot(driver , "Navigate to url-Failed");
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());										//Message of the exception
			System.out.println("Cause is " + e.getCause());	
		}

		try {
			Reporter.log("=======Clicking on upload file button=======",true);
			driver.findElement(By.name("uploaded_file")).click();									//Clicking on upload file button that is opening a windows application that we are handling with AutoIT
		} 
		catch (Exception e) {
			Reporter.log("=======Clicking on upload file button Failed=======",true);
			ScreenshotManager.cuptureScreenshot(driver , "Clicking on upload file button-Failed");
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());										//Message of the exception
			System.out.println("Cause is " + e.getCause());	
		}

		try {
			Reporter.log("=======Give script location=======",true);
			Runtime.getRuntime().exec(projectPath+ "/AutoIT/FileUploadScript.exe");					//Give script location to Runtime object $$$
		} 
		catch (Exception e) {
			Reporter.log("=======Give script location Failed=======",true);
			ScreenshotManager.cuptureScreenshot(driver , "Give script location-Failed");
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());										//Message of the exception
			System.out.println("Cause is " + e.getCause());	
		}
		
		try {
			Reporter.log("=======Locating and clicking the image button=======",true);
			Thread.sleep(10000);																	//Wait to run the desktop script
			driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/img[1]")).click();	//Locating and clicking the image button
		} 
		catch (Exception e) {
			Reporter.log("=======Locating and clicking the image button Failed=======",true);
			ScreenshotManager.cuptureScreenshot(driver , "Locating and clicking the image button-Failed");
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());										//Message of the exception
			System.out.println("Cause is " + e.getCause());	
		}
		
		try {
			Reporter.log("=======finished message=======",true);
			driver.findElement(By.xpath("//h3[contains(text(),'File upload finished.')]")).click();	//Locating the File upload finished message 
		} 
		catch (Exception e) {
			Reporter.log("=======finished message - Failed=======",true);
			ScreenshotManager.cuptureScreenshot(driver , "finished message-Failed");
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());										//Message of the exception
			System.out.println("Cause is " + e.getCause());	
		}
		
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}
}

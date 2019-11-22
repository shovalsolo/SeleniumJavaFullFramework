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
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoITDemo {
	
	public static WebDriver driver = null;
	public static String projectPath = System.getProperty("user.dir");				// Creating a parameter of the path to the firefox driver
	
	@Test
	public static void uploadFile() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			//A wait that will wait 10 seconds the default is zero and is applicable for the entire session
		driver.get("http://s000.tinyupload.com/index.php?");						//Navigate to url
		System.out.println(driver.getTitle());										//Will print the title of the page
		driver.findElement(By.name("uploaded_file")).click();						//Clicking on upload file button that is opening a windows application that we are handling with AutoIT
		
		
		
		Runtime.getRuntime().exec(projectPath+ "/AutoIT/FileUploadScript.exe");		//Give script location to Runtime object $$$
		
		
		
		Thread.sleep(10000);														//Wait to run the desktop script
		driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/img[1]")).click();	//Locating and clicking the image button
		driver.findElement(By.xpath("//h3[contains(text(),'File upload finished.')]")).click();	//Locating the File upload finished message 
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}
}

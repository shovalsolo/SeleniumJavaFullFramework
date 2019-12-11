/* 
 * This class is an example of how to take a screen shot - print screen
 * 1. Take screenshot and store is as a file format
 * 2. Copy the screenshot to the location using copyfile method
 */

package screenShotPrintScreen;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotHandler {
	
	static WebDriver driver =  null;
	public static String projectPath = System.getProperty("user.dir");			// Creating a parameter of the path to the project location
	
	public static void main(String[] args) throws  Exception {
		
		WebDriverManager.chromedriver().setup();								//Setting ChromeDriver
		driver = new ChromeDriver();											//Setting browser as Chrome
		
		driver.get("https://opensource-demo.orangehrmlive.com/");				//Going to URL
		
		takeScreenshot("orangehrlive-login");									//Tacking a screenshot
		
		
		WebElement username = driver.findElement(By.id("txtUsername"));			//Saving txtUsername to web element
		WebElement password = driver.findElement(By.id("txtPassword"));			//Saving txtPassword to web element
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));			//Saving btnLogin to web element
		
		takeElementScreenshot(username, "username");							//Calling to takeElementScreenshot method with WebElement and file name
		takeElementScreenshot(password, "password");							//Calling to takeElementScreenshot method with WebElement and file name
		takeElementScreenshot(btnLogin, "btnLogin");							//Calling to takeElementScreenshot method with WebElement and file name
		
		ScreenshotManager.cuptureScreenshot(driver , "print");					//This is calling ScreenshotManager.cuptureScreenshot with file name and the WebDriver to get a screenshot
		ScreenshotManager.cuptureScreenshot(driver , "PrintWebElem" , username);//This is calling ScreenshotManager.cuptureScreenshot with file name, WebElement and the WebDriver to get a screenshot
		
		
		username.sendKeys("Admin");												//Sending keys to field txtUsername
		password.sendKeys("admin123");											//Sending keys to field txtPassword
		btnLogin.sendKeys(Keys.RETURN);											//Clicking on the button with ID btnLogin
		
		takeScreenshot("orangehrlive-home");									//Tacking a screenshot
		
		Thread.sleep(5000);
		driver.close();
		driver.quit();
		
	}
	
	public static void takeScreenshot(String fileName )  {	//A method that is getting a file name and tacking a screenshot
			//1. Take screenshot and store is as a file format
		File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	//TakesScreenshot is an interface and converting driver to TakesScreenshot setting the output will be a file type and saving to file 
		
		
		try {
			//2. Copy the screenshot to the location using copyfile method give a name ant the type of the file .jpg
			FileUtils.copyFile(file, new File(projectPath+"/ScreenShots/"+fileName+".jpg"));	//Setting the project location + the folder for the screenshots + the file name + the type of the file
			
			//Example
			//FileUtils.copyFile(file, new File("path location to the folder of the screenshots "+fileName+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static void takeElementScreenshot(WebElement element , String fileName) {			//Method that is getting an WebElement and the file name
		
		File file =element.getScreenshotAs(OutputType.FILE);									//setting the output will be a file type and saving to file 
		try {
			FileUtils.copyFile(file, new File(projectPath+"/ScreenShots/"+fileName+".jpg"));	//Setting the project location + the folder for the screenshots + the file name + the type of the file
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}

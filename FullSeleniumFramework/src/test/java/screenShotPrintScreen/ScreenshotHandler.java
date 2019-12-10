/* 
 * This class is an example of how to take a screen shot - print screen
 * 1. Take screenshot and store is as a file format
 * 2. Copy the screenshot to the location using copyfile method
 */

package screenShotPrintScreen;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotHandler {
	
	static WebDriver driver =  null;
	public static String projectPath = System.getProperty("user.dir");			// Creating a parameter of the path to the project location
	
	public static void main(String[] args) throws IOException, Exception {
		
		WebDriverManager.chromedriver().setup();								//Setting ChromeDriver
		driver = new ChromeDriver();											//Setting browser as Chrome
		
		driver.get("https://opensource-demo.orangehrmlive.com/");				//Going to URL
		
		takeScreenshot("orangehrmlive");										//Tacking a screenshot
		
		Thread.sleep(5000);
		
		driver.close();
		driver.quit();
		
	}
	
	public static void takeScreenshot(String fileName ) throws IOException {	//A method that is getting a file name and tacking a screenshot
		//1. Take screenshot and store is as a file format
		File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	//TakesScreenshot is an interface and converting driver to TakesScreenshot setting the the output will be a file type and saving to file 
		
		//2. Copy the screenshot to the location using copyfile method give a name ant the type of the file .jpg
		FileUtils.copyFile(file, new File(projectPath+"/ScreenShots/"+fileName+".jpg"));	//Setting the project location + the folder for the screenshots + the file name + the type of the file
		
		//FileUtils.copyFile(file, new File("path location to the folder of the screenshots "+fileName+".jpg"));
		
	}

}

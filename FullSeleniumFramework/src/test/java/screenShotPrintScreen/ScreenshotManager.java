/* 
 * This class is an service class to take a screen shot - print screen
 * 1. Function cuptureScreenshot getting WebDriver driver, String fileName
 * 2. Function cuptureScreenshot getting WebDriver driver , String fileName ,WebElement element
 * 
 * Calling this class from ScreenshotHandler
 */

package screenShotPrintScreen;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScreenshotManager {
	
	public static String projectPath = System.getProperty("user.dir");							// Creating a parameter of the path to the project location
	
	public static void cuptureScreenshot(WebDriver driver, String fileName)  {					// Function that is getting file name and the WebDriver and tacking a screenshot 
		try {
			File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);				//TakesScreenshot is an interface and converting driver to TakesScreenshot setting the output will be a file type and saving to file 
			FileUtils.copyFile(file, new File(projectPath+"/ScreenShots/"+fileName+".jpg"));	//Setting the project location + the folder for the screenshots + the file name + the type of the file
			System.out.println("Screenshot taken");
		} 
		catch (Exception e) {
			System.out.println("Screenshot failed message" + e.getMessage());
			System.out.println("Screenshot failed Cause" + e.getCause());
			e.printStackTrace();
		}
	}
	
	public static void cuptureScreenshot(WebDriver driver , String fileName ,WebElement element) {	//Method that is getting an WebElement and the file name
		
		File file = element.getScreenshotAs(OutputType.FILE);									//setting the output will be a file type and saving to file 
		try {
			FileUtils.copyFile(file, new File(projectPath+"/ScreenShots/"+fileName+".jpg"));	//Setting the project location + the folder for the screenshots + the file name + the type of the file
		} 
		catch (IOException e) {
			System.out.println("Screenshot failed message" + e.getMessage());
			System.out.println("Screenshot failed Cause" + e.getCause());
			e.printStackTrace();
		}
	}

}

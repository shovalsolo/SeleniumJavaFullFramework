/* 
 * Desired Capabilities Demo how to set parameters to Internet explorer IE
 * Commands and info about how to set parameters in browsers
 * https://github.com/SeleniumHQ/selenium/wiki/DesiredCapabilities
 * https://selenium.dev/selenium/docs/api/java/org/openqa/selenium/remote/DesiredCapabilities.html
 */

package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilities_Demo {

	public static void main(String[] args) {
	
		WebDriverManager.iedriver().setup();												//Setting IE as the driver														%%%
		
		DesiredCapabilities caps = new DesiredCapabilities();								//Creating an object to set properties to IE browser							%%%
		caps.setCapability("ignoreProtectedModeSettings", true);							//Setting the parameter ignoreProtectedModeSettings to true						%%%
				
		WebDriver driver = new InternetExplorerDriver(caps);								//Setting Explorer driver to driver and giving the caps to set the properties	%%%
		
		driver.get("https://google.com");													//Navigating to google

		driver.findElement(By.name("q")).sendKeys("ExtentReports");							//Sending text to text field

		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);								//Clicking on search button

		driver.close();																		//Closing the browser
		
		driver.quit();																		//Closing the process
		
		System.out.println("Test completed Successfully");

	}

}

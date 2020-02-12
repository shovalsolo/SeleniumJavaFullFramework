/* 
 * This is a stand alone test to show how to use Extent Report %%% for impotent ctrl+a and ctrl+i
 */

package extentReport;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsBasicDemo {
	
	public static WebDriver driver = null;

	public static void main(String[] args) {
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");			//Start reports							%%%
		
		ExtentReports extent = new ExtentReports();											//Create ExtentReports and attach reporter	%%%
		extent.attachReporter(htmlReporter);												//Adding the report to the reporter		%%%
		
		ExtentTest test1 = extent.createTest("Test Name: Google search","Test Description: Validate Google search functionality");	//Creating Test name in the report and the description %%%
		
		WebDriverManager.chromedriver().setup();											//Initializing the webdriver
		
		driver = new ChromeDriver();														//Creating ChromeDriver
		
		test1.log(Status.INFO, "Starting Test Case");										//Starting to log the info of the test	%%%
		driver.get("https://google.com/"); 													//
		test1.pass("Navigated to Google");													//When pass will give this message		%%%
		
		
		driver.findElement(By.name("q")).sendKeys("ExtentReports");							//Sending text to text field
		test1.pass("Sent text to text field");												//When pass will give this message		%%%
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);								//Clicking on search button
		test1.pass("Clicked on search button ");											//When pass will give this message
		
		driver.close();																		//Closing the browser
		test1.pass("Closed the browser");													//When pass will give this message
		
		driver.quit();																		//Closing the process
		test1.pass("Closed the process");													//When pass will give this message
		
		test1.info("Test Completed");														//Logging the end of the test			%%%
		
		
		ExtentTest test2 = extent.createTest("Test Name: Google search fail","Test Description: Validate Google search functionality");	//Creating Test name in the report and the description
		
		WebDriverManager.chromedriver().setup();											//Initializing the webdriver
		
		driver = new ChromeDriver();														//Creating ChromeDriver
		
		test2.log(Status.INFO, "Starting Test Case");										//Starting to log the info of the test
		driver.get("https://google.com/"); 													//
		test2.pass("Navigated to Google");													//When pass will give this message
		
		
		driver.findElement(By.name("q")).sendKeys("ExtentReports");							//Sending text to text field
		test2.pass("Sent text to text field");												//When pass will give this message
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);								//Clicking on search button
		test2.fail("Clicked on search button ");											//When pass will give this message		%%%
		
		driver.close();																		//Closing the browser
		test2.pass("Closed the browser");													//When pass will give this message
		
		driver.quit();																		//Closing the process
		test2.pass("Closed the process");													//When pass will give this message
		
		test2.info("Test Completed");														//Logging the end of the test

		extent.flush();																		//Closing the report  VERY impotent!!!!	%%%
	}

}

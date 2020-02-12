/* 
 * This is a stand alone test to show how to use Extent Report %%% for impotent ctrl+a and ctrl+i
 */

package extentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

public class ExtentReportsDemoWithTestNG {
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	public static WebDriver driver = null;
	
	
	@BeforeSuite
	public void setUp() {

		WebDriverManager.chromedriver().setup();											//
		driver = new ChromeDriver();														//Setting chrome driver to driver
		htmlReporter = new ExtentHtmlReporter("extentReportWithTestNG.html");				//Start reports								%%%
		extent = new ExtentReports();														//Create ExtentReports and attach reporter	%%%
		extent.attachReporter(htmlReporter);												//Adding the report to the reporter			%%%
		
	}

	@Test
	public void test1() throws Exception {
  
		ExtentTest test1 = extent.createTest("MyFirstTest-1", "Sample description");		// creates a toggle for the given test, adds all log events under it 
		
		driver.get("https://google.com");
		test1.pass("navigated to google.com");
		
		test1.log(Status.INFO, "This step shows usage of log(status, details)");			// log(Status, details)

		test1.info("This step shows usage of info(details)");

		test1.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());	// log with snapshot

		test1.addScreenCaptureFromPath("screenshot.png");									// test with snapshot
	}

	@Test
	public void test2() throws Exception {

		ExtentTest test2 = extent.createTest("MyFirstTest-2", "Sample description");		// creates a toggle for the given test, adds all log events under it  
		
		test2.log(Status.INFO, "This step shows usage of log(status, details)");			// log(Status, details)
		
		test2.info("This step shows usage of info(details)");								// info(details)
		
		test2.pass("General test failed", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());	// log with snapshot
		
		test2.addScreenCaptureFromPath("screenshot.png");									// test with snapshot
	}

	
	@AfterTest																				//Will run after every test												%%%
	public void tearDownTest() {															//A func that is closing the browser 									%%%
		
		driver.close();																		//Closing the browser
		driver.quit();																		//Closing the process
		System.out.println("Test completed Successfully");
		
	}
	

	@AfterSuite																				// Will run only one time if you have multiple tests only in the end 	%%%
	public void tearDown() {																//A func to close the browser session									%%%

		extent.flush();																		// calling flush writes everything to the log file 						%%%

	}

}

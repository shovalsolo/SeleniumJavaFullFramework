/**
 * @author Solomon
 * 
 */
package extentReport;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo {
	
	
	
	@Test
	public void loginTest() throws IOException {
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("./reports/LoginToAmazonTest.html");	//Start reports	and setting the folder for the report 	%%%
		ExtentReports extent = new ExtentReports();														//Create ExtentReports object extent 					%%%
		extent.attachReporter(htmlReporter);															//Adding the htmlReporter to the extent reporter		%%%
		
		ExtentTest logger =  extent.createTest("LoginTest");											//Creating the first Test
		
		logger.log(Status.INFO, "login to amazon");														//Will Create this message when the test info
		logger.log(Status.PASS, "login to amazon PASS");												//Will Create this message when the test passed
		logger.log(Status.FAIL, "login to amazon FAIL");												//Will Create this message when the test failed
		logger.log(Status.FATAL, "login to amazon FATAL");												//Will Create this message when the test failed with fatal error
		logger.log(Status.SKIP, "login to amazon SKIP");												//Will Create this message when the test was skipped
		logger.log(Status.DEBUG, "login to amazon DEBUG");												//Will Create this message when the test was debugged
		logger.log(Status.WARNING, "login to amazon WARNING");											//Will Create this message when the test has a warning
		logger.addScreenCaptureFromPath("LoginPassed.jpg");											//
		extent.flush();																					//Creating the report
		System.out.println("Login to amazon");				
		
		
		ExtentTest logger1 =  extent.createTest("LoginTestFailed");										//Creating the first Test
		logger1.log(Status.FAIL, "login to amazon FAIL");												//Will Create this message when the test failed
		
		//logger1.addScreenCaptureFromPath("/reports/Login.jpg");																//Working in extentReport 3
		logger1.fail("Failed login", MediaEntityBuilder.createScreenCaptureFromPath("/reports/LoginFailed.jpg").build());	//Working in extentReport 3
		
		extent.flush();																					//Creating the report need to flush after every test
		System.out.println("Login to amazon failed");
	}
}

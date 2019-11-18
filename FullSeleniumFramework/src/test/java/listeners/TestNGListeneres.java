/* 
 * This is a class that is holding the listeners functionality being called from TestNGListenerDemo
 * 
 * To run this file need to run testng2.xml
 */

package listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeneres implements ITestListener,ISuiteListener {
	
	public void onTestStart(ITestResult result) {								//
		System.out.println("******** Test started :"+result.getName());
	}
	
	public void onTestSuccess(ITestResult result) {								//
		System.out.println("******** Test is Successful :"+result.getName());
	}
	
	public void onTestFailure(ITestResult result) {								//
		System.out.println("******** Test Failed :"+result.getName());
	}
	
	public void onTestSkipped(ITestResult result) {								//
		System.out.println("******** Test Skipped :"+result.getName());
	}
	
	public void onTestFailedButWithinSuccessPrecentage(ITestResult result) {	//
		
	}
	
	public void onStart(ITestResult context) {									//
		
	}
	
	public void onFinish(ITestResult context) {									//
		System.out.println("******** Test Completed :"+context.getName());
	}
	
	public void onStart(ISuite Suite) {											//Related to ISuite listener 
		
	}
	
	public void onFinish(ISuite Suite) {										//Related to ISuite listener
		
	}
}

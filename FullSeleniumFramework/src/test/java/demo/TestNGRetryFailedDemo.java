/* 
 * 1. Manually - run go to "test-output" folder find file "testing-failed.xml" and run manually again
 * 2. Automated - 
 * 3. After failure - 
 * Will run the test cases and will fail in test2 and test3   
 * 
 */

package demo;

import org.testng.annotations.Test;
import junit.framework.Assert;

public class TestNGRetryFailedDemo {
	
	@Test
	public void test1() {
		System.out.println("Hi from Test 1");
	}
	
	@Test
	public void test2() {
		//System.out.println("Hi from Test 2 before the error");
		int i=1/0;														//This test will fail
		System.out.println("Hi from Test 2");
		
		
	}
	
	@Test(retryAnalyzer = listeners.RetryAnalyzer.class)				//This will use "listeners.RetryAnalyzer.class" to rerun again the test
	public void test3() {
		//System.out.println("Hi from Test 3 before the error");
		Assert.assertTrue(false);										//This test will fail
		System.out.println("Hi from Test 3");
	}
	
	@Test
	public void test4() {
		System.out.println("Hi from Test 4");
	}
}

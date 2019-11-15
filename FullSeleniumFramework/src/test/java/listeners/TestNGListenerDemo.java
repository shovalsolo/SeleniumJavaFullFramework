/* 
 * This is a class that is calling the listeners from "TestNGListeneres"
 */

package listeners;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

@Listeners(listeners.TestNGListeneres.class)				//Adding annotation to the class that has all the listeners functionality 
public class TestNGListenerDemo {
	
	@Test													//
	public void test1() {
		System.out.println("Hi from Test 1");				//This test will pass and will show message from listener
	}
	
	@Test													//
	public void test2() {
		System.out.println("Hi from Test 2");				//
		Assert.assertTrue(false);							//This test will fail and will show message from listener
	}
	
	@Test													//
	public void test3() {
		System.out.println("Hi from Test 3");				//
		throw new SkipException("This test is skipped");	//Skip the test
	}

}

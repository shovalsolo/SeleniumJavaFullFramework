/* 
 * Will run test groups according to the testNG groups in testng7.xml -- 
 * To run this file need to run testng7.xml
 * Example of All Class Tests tag to run all the class
 */

package demo;

import org.testng.annotations.Test;

@Test(groups= {"AllClassTests"})					//Tag at the class level to run all test cases
public class TestNGGroupDemo3 {
	
	@Test(groups = {"sanity"})
	public void test1() {
		System.out.println("From test 1");			//
	}
	
	@Test(groups = {"windows.regression"})
	public void test2() {
		System.out.println("From test 2");			//
	}
	
	@Test(groups = {"linux.regression"})
	public void test3() {
		System.out.println("From test 3");			//
	}
	
	@Test(groups = {"regression"})
	public void test4() {
		System.out.println("From test 4");			//
	}
	
	@Test(groups = {"windows.sanity"})
	public void test5() {
		System.out.println("From test 5");			//
	}
}

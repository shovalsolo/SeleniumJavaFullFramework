/* 
 * Will run test groups according to the testNG groups in testng6.xml -- 
 * To run this file need to run testng6.xml
 * Example of regular expression in group
 */

package demo;

import org.testng.annotations.Test;

public class TestNGGroupDemo2 {
	
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

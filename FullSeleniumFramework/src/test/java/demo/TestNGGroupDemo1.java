/* 
 * Will run test groups according to the testNG groups in testng5.xml -- 
 * To run this file need to run testng5.xml
 * Example of Meta group the includes a few tags in one meta group
 */

package demo;

import org.testng.annotations.Test;

public class TestNGGroupDemo1 {
	
	@Test(groups = {"sanity"})
	public void test1() {
		System.out.println("From test 1");			//
	}
	
	@Test(groups = {"sanity","smoke"})
	public void test2() {
		System.out.println("From test 2");			//
	}
	
	@Test(groups = {"sanity","regression"})
	public void test3() {
		System.out.println("From test 3");			//
	}
	
	@Test(groups = {"regression"})
	public void test4() {
		System.out.println("From test 4");			//
	}
	
	@Test(groups = {"regression","smoke"})
	public void test5() {
		System.out.println("From test 5");			//
	}
}

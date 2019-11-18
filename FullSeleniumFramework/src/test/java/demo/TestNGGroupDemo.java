/* 
 * Will run test groups according to the testNG groups in testng4.xml -- 
 * To run this file need to run testng4.xml
 * Example of include exclude groups
 */

package demo;

import org.testng.annotations.Test;

public class TestNGGroupDemo {
	
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

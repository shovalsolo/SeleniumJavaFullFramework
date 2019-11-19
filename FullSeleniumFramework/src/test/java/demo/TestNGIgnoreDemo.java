/* 
 * Will run test with parameters from testng8.xml -- 
 * To run this file need to run testng8.xml
 *  
 */

package demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//@Ignore										//Possible to ignore the whole class
public class TestNGIgnoreDemo {
	
	@Test
	public void test1() {
		System.out.println("Hi from test1 ");
	}
	
	@Test
	public void test2() {
		System.out.println("Hi from test2 ");
	}
	
	@Test
	@Ignore										//Possible to ignore a single test
	public void test3() {
		System.out.println("Hi from test3 ");
	}
	
	@Test
	public void test4() {
		System.out.println("Hi from test4 ");
	}

}

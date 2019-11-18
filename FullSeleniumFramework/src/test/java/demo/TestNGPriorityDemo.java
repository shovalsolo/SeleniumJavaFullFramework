/* 
 * Will run according to the priority from low to high the lowest has the highest priority -- 
 * the second parameter for order is alphabetical name of the functions -- 
 * no priority is equal to priority zero
 */

package demo;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {
	
	@Test(priority = 1)						//Will run according to the priority from low to high the lowest has the highest priority will be last
	public void test1() {
		System.out.println("From test 1");	//
	}

	@Test(priority = -1)					//Will run according to the priority from low to high the lowest has the highest priority will run first
	public void test2() {
		System.out.println("From test 2");	//
	}

	@Test(priority = 0)						//Will run according to the priority from low to high the lowest has the highest priority will run second 
	public void test3() {
		System.out.println("From test 3");	//
	}
	
	@Test(priority = 0)						//Will run according to the priority from low to high the lowest has the highest priority will run second 
	public void test4() {
		System.out.println("From test 4");	//
	}
	
	@Test									//No priority is equal to priority zero --No priority the same as priority = 0
	public void test5() {
		System.out.println("From test 5");	//
	}

}

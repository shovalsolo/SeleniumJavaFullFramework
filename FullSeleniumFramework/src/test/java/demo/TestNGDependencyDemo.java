/* 
 * Will run test with dependencies priorities
 * Example for dependsOnMethod and dependsOnGroups
 * Test1 dependsOnMethod of Test2 so test2 will run first and test1 will run second 
 * Dependency is stronger than priority
 * Regular expression dependencies 
 */

package demo;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	
	@Test(dependsOnMethods = {"test2"} , priority=1)		//Defining that test1 dependsOnMethod of test2 and the priority is 1
	public void test1() {
		System.out.println("Hi from test1 dependsOnMethods test2 and priority=1");
	}
	
	@Test(priority=2)										//Defining priority is 2 but dependency is stronger than priority
	public void test2() {
		System.out.println("Hi from test2 priority=2");		//Test2 will run before test1 because test1 dependsOnMethod of test2
	}
	
	@Test													//Will run first because no priority is priority 0
	public void test3() {
		System.out.println("Hi from test3 - No priority is priority 0");
	}
	
	@Test(dependsOnMethods = {"test2" , "test3"})			//Will run only after test2 and test3 were run multi Dependencies 
	public void test4() {
		System.out.println("Hi from test4 - dependsOnMethods test2 and test3");
	}
	
	@Test													//Will run as priority 0
	public void test5() {
		System.out.println("Hi from test5 - No priority is priority 0");
	}
	
	@Test(dependsOnGroups= {"sanity.*"})					//Will run only after group sanity was run all the sanity types
	public void test6() {
		System.out.println("Hi from test6  dependsOnGroups - sanity");
	}
	
	@Test(groups= {"sanity1"})								//Will run as priority 0
	public void test7() {
		System.out.println("Hi from test7 Groups - sanity run as priority 0");
	}
	
	@Test(groups= {"sanity2"})								//Will run as priority 0
	public void test8() {
		System.out.println("Hi from test8 Groups - sanity run as priority 0");
	}
}

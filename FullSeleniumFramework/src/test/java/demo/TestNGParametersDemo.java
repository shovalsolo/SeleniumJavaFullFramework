/* 
 * Will run test with parameters from testng8.xml -- 
 * To run this file need to run testng8.xml
 * Example of parameters in TestNG  
 * Optional parameters
 * Default value for optional parameters
 */

package demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersDemo {
	
	@Test
	@Parameters({"Myname" , "abc"})										//@Parameters tag with the parameters we want to pass 
	public void test(String name ,@Optional("Roni") String abc) {		//Providing 2 parameters to the function one of them is @Optional not mandatory abc is optional with default of roni
		
		System.out.println("Name is  :"+name);
		System.out.println("What about abc  :"+abc);					//When not passing parameters it will be null if this parameter doesn't have an default
	}
}

/* 
 * This class is showing about uninitialized global and local variable
 * 1. A local variable contains garbage values -- A variable that is not initialized contains garbag -- 
 * 2. A global variable declared at the class level and contains null value/default values when not initialized
 */

package dataTypeDemo;

public class VariableDemo {
	
	static int number;
	
	public static void main (String[] args) {
		
		int total_all;									// A variable that is not initialized contains garbage
		
		//System.out.println("total_all is:"+ total_all);// If you not initializing the variable java will give you an error
		
		System.out.println("number is:"+ number);		// If you not initializing the variable you can still use it and it will be null value/default values
	}

}

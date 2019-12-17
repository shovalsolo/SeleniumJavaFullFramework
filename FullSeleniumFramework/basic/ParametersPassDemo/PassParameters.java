/* 
 * This class is showing how to pass parameters to a non static function
 * Non static- need to create an object of the class to use the functions and parameters 
 */

package ParametersPassDemo;

public class PassParameters {

	public static void main(String[] args) {
		
		ReturnParameters obj1 = new ReturnParameters();	//Creating a class object to use the function that are not static
		
		obj1.add(455, 8);								//Using the object to call the add function
		
		obj1.sub(3, 8);									//Using the object to call the add function

	}
	
	public void add(int a, int b) {
		
		int c=a+b;
		System.out.println("Hey this is c: " + c);
	
	}

	public void sub(double x, double y) {
		
		double result=y-x;
		
		System.out.println("Hey substruction result is:  " + result);
	}
}

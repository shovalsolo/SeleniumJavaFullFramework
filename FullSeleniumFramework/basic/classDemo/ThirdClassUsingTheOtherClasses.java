/* 
 * This class is showing about a class that has a function without a static so you have to create an object of the class to use the function
 * 1. FirstClassNoStaticFunctionDemo obj1 = new FirstClassNoStaticFunctionDemo();
 * 2. obj1.sum();
 * 
 * Non-Static method: Can be called through an object of the class using the (.) operator
 * FirstClassNoStaticFunctionDemo obj1 = new FirstClassNoStaticFunctionDemo();
 * obj1.sum();
 * 
 * Static method: can be called using the Class name directly using the (.) operator
 * SecondClassWithStaticFunctionDemo.add(); for static method in class
 */

package classDemo;
public class ThirdClassUsingTheOtherClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Start of the program");
		
		FirstClassNoStaticFunctionDemo obj1 = new FirstClassNoStaticFunctionDemo();		//%%% Creating an object of the class to a non static function
		
		obj1.sum();																		//Using the object to get to the function
		
		System.out.println("X value is: "+obj1.x);										//Printing X value with the use of the object
		
		System.out.println("Y value is: "+obj1.y);										//Printing Y value with the use of the object
		
		SecondClassWithStaticFunctionDemo.add(); 										//%%% add is a static function so to call it we only use the class name.functionName no need to create on object

		System.out.println("End of program");
	}

}

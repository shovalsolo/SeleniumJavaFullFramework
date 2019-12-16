/* 
 * This class is showing about a class that has a function without a static so you have to create an object of the class to use the function
 * 1. FirstClassNoStaticFunctionDemo obj1 = new FirstClassNoStaticFunctionDemo();
 * 2. obj1.sum();
 * 
 * Non-Static method: Can be called through an object of the class using the (.) operator
 * Static method: can be called using the Class name directly using the (.) operator
 */


package classDemo;

public class FirstClassNoStaticFunctionDemo {
	
	int x=90;
	int y=100;

	public static void main(String[] args) {
		
		System.out.println("Start of the program");
		
		FirstClassNoStaticFunctionDemo obj1 = new FirstClassNoStaticFunctionDemo();		//Creating an object of the class
		
		obj1.sum();																		//Using the object to get to the function
		
		System.out.println("X value is: "+obj1.x);										//Printing X value with the use of the object
		
		System.out.println("Y value is: "+obj1.y);										//Printing Y value with the use of the object

		System.out.println("End of program");
	}
	
	public void sum() 
	{
		int a=90;
		int b=100;
		int c=b+a;
		
		System.out.println("The sum of"+ " a = "+ a +" b = " + b + " c = b + a = "+ c + " from class FirstClassNoStaticFunctionDemo");
	}
	
	

}

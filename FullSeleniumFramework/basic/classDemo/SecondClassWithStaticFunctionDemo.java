/* 
 * This class is showing about a class that has a function without a static so you have to create an object of the class to use the function
 * 1. FirstClassNoStaticFunctionDemo obj1 = new FirstClassNoStaticFunctionDemo();
 * 2. obj1.sum();
 * 
 * Non-Static method: Can be called through an object of the class using the (.) operator
 * Static method: can be called using the Class name directly using the (.) operator
 */


package classDemo;

public class SecondClassWithStaticFunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Start of the program");
		
		add();																			//Calling the static function- no need to create an object of the class

		System.out.println("End of program");
	}
	
	public static void add() 
	{
		int d=90;
		int e=100;
		int f=e+d;
		
		System.out.println("The sum of"+ " d = "+ d +" e = " + e + " f = e + d = "+ f + " from class SecondClassWithStaticFunctionDemo");
	}

}

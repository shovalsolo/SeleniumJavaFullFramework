/* 
 * This class is showing about compileTime Overloading Polymorphism we have 3 types of Overloading
 * 1. First type of Polymorphism is when Overloading the same function and extending it when adding more variables (number of arguments)
 * 2. Second type of Polymorphism is when Overloading the same function and extending it when adding different type of variables (type of arguments)
 * 3. Third type of Polymorphism is when Overloading the same function and extending it when adding different order of the variables (order of variables)
 */

package compileTimeOverloadingPolymorphism;

public class CompleOverloadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CompleOverloadDemo1 obj = new CompleOverloadDemo1();
		
		obj.add(1, 3); 										//Calling first function with 2 parameters
		obj.add(3.2, 3);									//Calling second function with 2 different type of parameters
		obj.add(2, 3, 1);									//Calling third function with 3 parameters
		obj.add(3, 3.4);									//Calling Forth function with 2 different type of parameters in different order

	}
	
	public void add (int a , int b) {						//First method getting 2 parameters of int
		int c=a+b;
		System.out.println("Sum of numbers is : " + c);
	}
	
	public void add (double a , int b) {					//Second method getting 2 parameters 1 double and 1 int
		double c=a+b;
		System.out.println("Sum of numbers is : " + c);
	}

	public void add (int a , int b , int d) {				//Third method overloading the first and adding one more argument to the function
		int c=a+b;
		System.out.println("Sum of numbers is : " + c + " and d is :  "+ d);
	}
	
	public void add (int b , double a) {					//Forth method getting 2 parameters 1 int and 1 double in a different order from second function   
		double c=a+b;
		System.out.println("Sum of numbers is : " + c);
	}
}

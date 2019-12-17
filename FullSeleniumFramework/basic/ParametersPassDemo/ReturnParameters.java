/* 
 * This class is showing how to return parameters from a functions non static and static
 * 1. Non static- need to create an object of the class
 * 1. Static - Call the function directly
 */

package ParametersPassDemo;

public class ReturnParameters {

	public static void main(String[] args) {
		
		ReturnParameters obj1 = new ReturnParameters();		//Creating a class object to use the function that are not static
		
		int sum = obj1.add(455, 8);							//Using the object to call the add function
		
		double sum1 = obj1.sub(3, 8);						//Using the object to call the add function
		
		System.out.println("Return value of add : "+sum);	//Printing the return value from add %%%
		
		System.out.println("Return value of sub : "+sum1);	//Printing the return value from sub %%%
		
		System.out.println(getMyFullName("Davi", "Coli"));	//Calling a static function no need to use the object just call the function directly
	}
	
	public int add(int a, int b) {							//A function that is getting 2 parameters adding and returning result
		
		int c=a+b;
		System.out.println("Hey this is c: " + c);
		
		return c;											//Returning the result %%%
	}

	public double sub(double x, double y) {					//A function that is getting 2 parameters subtracting and returning result
		
		double result=y-x;
		System.out.println("Hey substruction result is:  " + result);
		
		return result;										//Returning the result  %%%
	}
	
	public static String getMyFullName(String first , String lastname) { //A function that is getting 2 parameters and returning result
		
		String fullname= first +" "+lastname;
		
		return fullname;
	}
}

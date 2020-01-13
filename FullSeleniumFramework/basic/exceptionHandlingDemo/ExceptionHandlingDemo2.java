/* 
 * This class is showing about exception handling using try and finally 
 */

package exceptionHandlingDemo;

public class ExceptionHandlingDemo2 {

	public static void main(String[] args) {
		
		System.out.println("Strat");												//Printing for the start of the program
		
		try {
			int c=10/0;																//This line will fail cannot divide number by 0
			
			System.out.println("Div result is : " + c);								//SPrinting the result
		} 
		finally{
			System.out.println("Error in dividing the numbers");	//Printing for the start of the program
			System.out.println("finally block");
			System.out.println("End");
		}													//Printing for the start of the program
	}

}

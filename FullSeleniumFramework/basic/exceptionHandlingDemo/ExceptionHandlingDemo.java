/* 
 * This class is showing about exception handling using try and catch
 */

package exceptionHandlingDemo;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		System.out.println("Strat");												//Printing for the start of the program
		
		try {
			int c=10/0;																//This line will fail cannot divide number by 0
			
			System.out.println("Div result is : " + c);								//SPrinting the result
		
		} catch (ArithmeticException e) {
			
			System.out.println("Error in dividing the numbers" + e.getMessage());	//Printing for the start of the program
			
			System.out.println(e.getLocalizedMessage());
		}

		System.out.println("End");													//Printing for the start of the program
	}

}

/* 
 * This class is showing about exception handling using throws exception
 * When throwing an exception the JVM is handling the exception so it is better to use try catch instead
 * Exception - is a general exception for all Exceptions 
 */

package exceptionHandlingDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowExceptionHandlingDemo3 {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException, AWTException, Exception {	//We can throw multiple exceptions or the general Exception
		
		System.out.println("Strat");					//Printing for the start of the program
		
		Thread.sleep(5000);								//The thread.sleep is throwing an error so we need to add throws InterruptedException to the function or the main 
		
		FileInputStream fis= new FileInputStream(""); 	//FileInputStream is throwing an error so we need to add throws FileNotFoundException
		
		Robot a = new Robot(); 							//Robot is throwing an error so we need to add throws AWTException
		
		System.out.println("End");
	}

}

/* 
 * This class is showing about java data types
 * Primitive - non object – normal values and values with numbers (integer, double, boolean, char, bit, short, long and float) – they all start with a lower case letters
 * Class object – The data type is a class (String, WebDriver, WebElement) – They all start with upper case letters 
 */

package dataType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DataType 
{
	public static void main(String[] args) 
	{
		// Non-object Data Types
		int age=1;						//Does not allows decimal point (1)
		
		double price = 34.1;			//Does allows decimal point (1.5)
		
		boolean result= true;			//Only allows True or False

		
		//Object Data Types
		String customer = "John Doe";	//String needs to hold the content inside a ""
		
		customer.charAt(0);				//We can add a dot only after a class and not on a primitive data type
		
		WebDriver driver;				//WebDriver as the class and the driver as the object - both of them will contain the same methods because the object is representing the class
		
		WebElement button;				//WebElement as the class and the button as the object - both of them will contain the same methods because the object is representing the class
	}
}

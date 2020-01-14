/* 
 * This class is showing about String functions: 
 * 1. startsWith("string to search")-Checks if a string start with 
 * 2. endsWith("string to search")-Checks if a string end with
 */

package classStringDemo;

public class StringStartEndWithDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Selenium WebDriver";
		String name1="Welcome to Selenium WebDriver";
		
		boolean status = name.startsWith("Selenium");					//Checks if a string start with 
		System.out.println("Status is: "+ status);
		
		System.out.println("Status end  with WebDriver :"+name.endsWith("WebDriver"));
		
		
		boolean status2 = name1.endsWith("World");						//Checks if a string end with
		
		System.out.println("Status1 end  with World :"+name1.endsWith("World"));

	}

}

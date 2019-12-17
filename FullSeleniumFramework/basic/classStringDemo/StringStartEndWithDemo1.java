/* 
 * This class is showing about String functions: 
 * 1. startsWith()
 * 2. endsWith()
 */

package classStringDemo;

public class StringStartEndWithDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Selenium WebDriver";
		String name1="Welcome to Selenium WebDriver";
		
		boolean status = name.startsWith("Selenium");
		System.out.println("Status is: "+ status);
		
		System.out.println("Status end  with WebDriver :"+name.endsWith("WebDriver"));
		
		
		boolean status2 = name1.endsWith("World");
		
		System.out.println("Status1 end  with World :"+name1.endsWith("World"));

	}

}

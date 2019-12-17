/* 
 * This class is showing about String function: equalsIgnoreCase
 * equalsIgnoreCase(); will check if 2 strings are equal ignoring case
 */

package classStringDemo;

public class StringEqualDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String actual="Welcome to Selenium WebDriver world";
		String expected="Welcome to Selenium world";
		
		boolean ststus = actual.equalsIgnoreCase(expected);
		
		System.out.println("Is actual string  equal to expected string: "+ststus);
		
	}

}

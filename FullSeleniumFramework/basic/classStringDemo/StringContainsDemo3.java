/* 
 * This class is showing about String function contains
 * contains() checks if a string is a pare of another string and returning true or false
 */

package classStringDemo;

public class StringContainsDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String actual="Welcome to Selenium WebDriver world";
		String expected="Welcome to Selenium world";
		String expected1="Welcome";
		
		boolean ststus = actual.contains(expected);
		
		boolean ststus1 = actual.contains(expected1);
		
		System.out.println("Is actual string contains expected string: "+ststus);
		
		System.out.println("Is actual string contains expected1 string: "+ststus1);
	}

}

/* 
 * This class is showing about String function Trim
 * Trim(); is is trimming the spaces in the string but only in the beginning and the end of the string
 */

package classStringDemo;

public class StringTrimDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String actual="Welcome to Selenium WebDriver world";
		String expected="Welcome to Selenium world";
		String fullname="             Welcome Selenium HP QTP GRID World                      ";
		
		
		String name = fullname.trim();				//This will trim the spaces in the  beginning and the end of the string
		
		System.out.println("String before Trim : "+fullname);
		System.out.println("String after Trim : "+name);
		
	}

}

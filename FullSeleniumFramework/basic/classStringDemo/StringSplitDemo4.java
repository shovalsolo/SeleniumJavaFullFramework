/* 
 * This class is showing about String function split
 * split("-"); is splitting an string in to array - need to tell the function when to split like "-"
 */

package classStringDemo;

public class StringSplitDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String actual="Welcome to Selenium WebDriver world";
		String expected="Welcome to Selenium world";
		String fullname="Welcome-Selenium-HP-QTP-GRID-World";
		
		
		String []toolname = fullname.split("-");				//Returning to array and splitting every time that we have - in the string
		
		
		for (int i = 0; i < toolname.length; i++) {					//Will run a loop in the size of the array that was created 
			System.out.println("Value of Cell "+ i +" is "+ toolname[i]);//Printing every cell in the array
			if (toolname[i].equalsIgnoreCase("Selenium")) {
				System.out.println("Selenium is in the string fullname "+ fullname);
				System.out.println("Test Passed");
			}
		}
	}

}

/* 
 * This is a demo for ArrayList how to print the content of the ArrayList with an enhanced for loop
 * Enhanced for loop - using Object and a parameter(abc) in the loop moving the content of the ArrayList cell in the the parameter and this is for every loop 
 */

package listDemo;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList al1 = new ArrayList();		//Creating an object of ArrayList no need to need size to the array
		
		al1.add(1597538322);					//Adding a integer to the ArrayList
		
		al1.add("M");							//Adding a char to the ArrayList
		
		al1.add("Selenium WebDriver");			//Adding a string to the ArrayList
		
		al1.add("Selenium WebDriver");			//Adding the same string to the ArrayList
		
		al1.add(12.36);							//Adding a double to the ArrayList
		
		System.out.println(al1);				//Will return all the values in the ArrayList in a list formation
		
		for(Object abc:al1) {					//Using an enhanced for loop to print the values
			System.out.println("The values from the ArrayList: "+abc);
		}

		
		
	}

}

/* 
 * This is a demo for ArrayList how to print the content of the ArrayList
 */

package listDemo;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		ArrayList al1 = new ArrayList();		//Creating an object of ArrayList no need to need size to the array
		
		al1.add(1597538322);					//Adding a integer to the ArrayList
		
		al1.add("M");							//Adding a char to the ArrayList
		
		al1.add("Selenium WebDriver");			//Adding a string to the ArrayList
		
		al1.add("Selenium WebDriver");			//Adding the same string to the ArrayList
		
		al1.add(12.36);							//Adding a double to the ArrayList
		
		System.out.println(al1);				//Will return all the values in the ArrayList in a list formation
		
		int listSize = al1.size();
		
		for (int i = 0; i < listSize; i++) {
			System.out.println("The values fron the ArrayList: "+al1.get(i));
		}
	}

}







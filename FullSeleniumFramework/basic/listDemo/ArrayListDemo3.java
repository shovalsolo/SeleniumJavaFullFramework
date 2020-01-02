/* 
 * This is a demo for ArrayList how to print the content of the ArrayList with an Iterator and a while loop
 * Iterator - A Object that we can use for the loops need to import from java.utils
 */

package listDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		ArrayList al1 = new ArrayList();		//Creating an object of ArrayList no need to need size to the array
		
		al1.add(1597538322);					//Adding a integer to the ArrayList
		
		al1.add("M");							//Adding a char to the ArrayList
		
		al1.add("Selenium WebDriver");			//Adding a string to the ArrayList
		
		al1.add("Selenium WebDriver");			//Adding the same string to the ArrayList
		
		al1.add(12.36);							//Adding a double to the ArrayList
		
		System.out.println(al1);				//Will return all the values in the ArrayList in a list formation
		
		Iterator itr = al1.iterator();
		
		while(itr.hasNext()) {					//Checking if there is a next value in the list in the ArrayList
			Object value =  itr.next();			//Saving the content in to value parameter 
			System.out.println("The values from the ArrayList: "+value);	//Printing the parameter
		}
	}

}

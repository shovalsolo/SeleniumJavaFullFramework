/* 
 * This is a demo for ArrayList with a limited type <String>  
 * ArrayList<String> is used to limit the array type of parameters 
 * Enhanced for loop - using Object and a parameter(abc) in the loop moving the content of the ArrayList cell in the the parameter and this is for every loop
 */

package listDemo;

import java.util.ArrayList;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		
		ArrayList<String> al1 =  new ArrayList<String>();
		
		al1.add("Selenium WebDriver");			//Adding a string to the ArrayList
		
		al1.add("Sel");							//Adding a string to the ArrayList
		
		al1.add("Web");							//Adding a string to the ArrayList
		
		//al1.add(111);							//Adding a integer to the ArrayList<String> will give an error
		
		for(String v:al1) {
			System.out.println("The values from the ArrayList: "+v);
		}
	}

}

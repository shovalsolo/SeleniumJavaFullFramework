/* 
 * This is a demo for ArrayList
 * When creating an object of ArrayList no need to need size to the array
 * ArrayList- is a class that implements list uses a dynamic array for storing the values
 * ArrayList the Type is fixed and the size is fixed 
 * ArrayList uses a dynamic array for storing the elements, it is also maintaining the insertion order. 
 */

package listDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList al1 = new ArrayList();		//Creating an object of ArrayList no need to need size to the array
		
		al1.add(1597538322);					//Adding a integer to the ArrayList
		
		al1.add("M");							//Adding a char to the ArrayList
		
		al1.add("Selenium WebDriver");			//Adding a string to the ArrayList
		
		al1.add(12.36);							//Adding a double to the ArrayList
		
		System.out.println(al1.isEmpty());		//Will return true or false if the array is empty or not
		
		System.out.println(al1.size());			//Will return the size of the array
		
		System.out.println(al1);				//Will return all the values in the ArrayList in a list formation
		
		System.out.println(al1.get(3));			//Will return the element in cell 4 because the array starts at 0
		
		System.out.println(al1.get(2));			//Will return the element in cell 3 
		
		System.out.println(al1.get(1));			//Will return the element in cell 2 
		
		System.out.println(al1.get(0));			//Will return the element in cell 1 
		
	}

}

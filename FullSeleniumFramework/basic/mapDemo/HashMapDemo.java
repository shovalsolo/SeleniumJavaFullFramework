/* 
 * This class is showing about HashMap how to insert to the HashMap and how to print
 * 1. HashMap is a class that is implementing the Map interface.
 * 2. HashMap can have only unique key and values 
 * 3. HashMap after inserting the keys and values the saved order is not according to the insertion order
 */

package mapDemo;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String, String> objHM1 =  new HashMap<String, String>();	//Creating an object of type HashMap that contains String types for key and value
		objHM1.put("400", "HashMap");										//Inserting unique key and value to the HashMap
		objHM1.put("500", "Java");											//Inserting unique key and value to the HashMap
		objHM1.put("800", "Project");										//Duplicate key and value will not be inserted to the HashMap		%%%
		objHM1.put("600", "test");											//Inserting unique key and value to the HashMap
		objHM1.put("601", "test1");											//Inserting unique key and value to the HashMap
		objHM1.put("602", "test2");											//Inserting unique key and value to the HashMap
		objHM1.put("700", "Selenium");										//Inserting unique key and value to the HashMap
		objHM1.put("800", "Project");										//Inserting unique key and value to the HashMap
		
		
		System.out.println(objHM1);											//This will print the following not in the order of the insertion {400=HashMap, 500=Java, 600=test, 601=test1, 700=Selenium, 602=test2, 800=Project}

		String param = objHM1.get("700");									//Saving the value from key 700 to param
		System.out.println("Value from HashMap is "+ param);				//Printing the param from key 700
	}

}

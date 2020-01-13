/* 
 * This class is showing about LinkedHashMap how to insert to the LinkedHashMap and how to print
 * 1. LinkedHashMap is a class that is implementing the Map interface.
 * 2. LinkedHashMap can have only unique key and values 
 * 3. LinkedHashMap after inserting the keys and values the saved order is according to the insertion order
 */

package mapDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.google.common.collect.Multiset.Entry;

public class LinkedHashMapDemo2 {

	public static void main(String[] args) {
		
		LinkedHashMap<String, String> objHM1 =  new LinkedHashMap<String, String>();	//Creating an object of type LinkedHashMap that contains String types for key and value
		objHM1.put("400", "HashMap");										//Inserting unique key and value to the LinkedHashMap
		objHM1.put("500", "Java");											//Inserting unique key and value to the HashMap
		objHM1.put("800", "Project");										//Duplicate key and value will not be inserted to the LinkedHashMap		%%%
		objHM1.put("600", "test");											//Inserting unique key and value to the LinkedHashMap
		objHM1.put("601", "test1");											//Inserting unique key and value to the LinkedHashMap
		objHM1.put("602", "test2");											//Inserting unique key and value to the LinkedHashMap
		objHM1.put("700", "Selenium");										//Inserting unique key and value to the LinkedHashMap
		objHM1.put("800", "Project");										//Inserting unique key and value to the LinkedHashMap
		
		
		for (Map.Entry<String, String> data :objHM1.entrySet()) {			//Enhanced for loop to print the LinkedHashMap values and keys inserting it to data
			System.out.println(data.getKey() + " and value is :  " +data.getValue());	//Every loop printing the data with key and value
		}
		
		System.out.println(objHM1);											//This will print the following in the order of the insertion
		
	}

}

/* 
 * This class is showing about TreeMap how to insert to the TreeMap and how to print
 * 1. TreeMap is a class that is implementing the NavigatableMap interface.
 * 2. TreeMap is supporting ascending  and Descending ordering 
 * 2. TreeMap can have only unique key and values 
 * 3. TreeMap after inserting the keys and values the saved order is according to the insertion order
 */

package mapDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import com.google.common.collect.Multiset.Entry;

public class TreeMapDemo3 {

	public static void main(String[] args) {
		
		TreeMap<String, String> objHM1 =  new TreeMap<String, String>();	//Creating an object of type TreeMap that contains String types for key and value
		objHM1.put("400", "HashMap");										//Inserting unique key and value to the TreeMap
		objHM1.put("500", "Java");											//Inserting unique key and value to the TreeMap
		objHM1.put("800", "Project");										//Duplicate key and value will not be inserted to the TreeMap		%%%
		objHM1.put("600", "test");											//Inserting unique key and value to the TreeMap
		objHM1.put("601", "test1");											//Inserting unique key and value to the TreeMap
		objHM1.put("602", "test2");											//Inserting unique key and value to the TreeMap
		objHM1.put("700", "Selenium");										//Inserting unique key and value to the TreeMap
		objHM1.put("800", "Project");										//Inserting unique key and value to the TreeMap
		
		
		for (Map.Entry<String, String> data :objHM1.entrySet()) {			//Enhanced for loop to print the LinkedHashMap values and keys inserting it to data
			System.out.println(data.getKey() + " and value is :  " +data.getValue());	//Every loop printing the data with key and value
		}
		
		System.out.println(objHM1);											//This will print the TreeMap in asc order
		
	}

}

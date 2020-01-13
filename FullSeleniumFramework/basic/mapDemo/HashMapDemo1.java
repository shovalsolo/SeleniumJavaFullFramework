/* 
 * This class is showing about HashMap how to insert to the HashMap and how to print
 * 1. HashMap is a class that is implementing the Map interface.
 * 2. HashMap can have only unique key and values 
 * 3. HashMap after inserting the keys and values the saved order is not according to the insertion order
 *  https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
 */

package mapDemo;

import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.Multiset.Entry;

public class HashMapDemo1 {

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
		
		
		for (Map.Entry<String, String> data :objHM1.entrySet()) {			//Enhanced for loop to print the HashMap values and keys inserting it to data
			System.out.println(data.getKey() + " and value is :  " +data.getValue());	//Every loop printing the data with key and value
		}
	}

}

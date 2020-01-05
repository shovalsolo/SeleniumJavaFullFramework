/* 
 * This class is showing about HashSet
 * 1. It will store every value once it will not create duplicates 
 * 2. The order of the array will not be according to the order of insertion 
 */

package setDemo;

import java.util.HashSet;

public class SetHashSetDemo1 {

	public static void main(String[] args) {
		
		HashSet<String> values = new HashSet<String>();		//Creating 
		
		values.add("Selenium");								//Adding strong to the HashSet
		
		values.add("QTQ");									//Adding strong to the HashSet
		
		values.add("Qinto");								//Adding strong to the HashSet
		
		values.add("1");									//Adding char to the HashSet
		
		values.add("1");									//Adding same char to the HashSet will only add it once %%
		
		values.add("ABC");									//Adding strong to the HashSet

		System.out.println(values); 						//This will print the values array but in a different order
		
		for (String e:values) {								//Enhanced loop to print the HashSet array
			System.err.println(e);
		}
	}

}

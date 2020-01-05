/* 
 * This class is showing about LinkHashSet
 * 1. It will store every value once it will not create duplicates 
 * 2. The order of the array will be according to the order of insertion 
 */

package setDemo;

import java.util.LinkedHashSet;

public class SetLinkedHashSetDemo2 {

	public static void main(String[] args) {
		
		LinkedHashSet<String> values = new LinkedHashSet<String>();		//Creating an LinkHashSet of type String
		
		values.add("Selenium1");							//Adding strong to the LinkHashSet
		
		values.add("QTQ2");									//Adding strong to the LinkHashSet
		
		values.add("Qinto3");								//Adding strong to the LinkHashSet
		
		values.add("14");									//Adding char to the LinkHashSet
		
		values.add("14");									//Adding same char to the LinkHashSet will only add it once %%
		
		values.add("ABC5");									//Adding strong to the LinkHashSet

		System.out.println(values); 						//This will print the values array according to the order of insertion 
		
		for (String e:values) {								//Enhanced loop to print the LinkHashSet array according to the order of insertion 
			System.err.println(e);
		}
	}

}

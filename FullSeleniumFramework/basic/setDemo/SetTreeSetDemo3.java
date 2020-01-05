/* 
 * This class is showing about TreeSet
 * 1. It will store every value once it will not create duplicates 
 * 2. The order of the array will be ascending
 */

package setDemo;


import java.util.TreeSet;

public class SetTreeSetDemo3 {

	public static void main(String[] args) {
		
		TreeSet<String> values = new TreeSet<String>();		//Creating an TreeSet of type String
		
		values.add("Selenium1");							//Adding strong to the TreeSet
		
		values.add("QTQ2");									//Adding strong to the TreeSet
		
		values.add("Qinto3");								//Adding strong to the TreeSet
		
		values.add("14");									//Adding char to the TreeSet
		
		values.add("14");									//Adding same char to the TreeSet will only add it once %%
		
		values.add("ABC5");									//Adding strong to the TreeSet

		System.out.println(values); 						//This will print the values with ascending order
		
		for (String e:values) {								//Enhanced loop to print the TreeSet array with ascending order
			System.err.println(e);
		}
	}

}

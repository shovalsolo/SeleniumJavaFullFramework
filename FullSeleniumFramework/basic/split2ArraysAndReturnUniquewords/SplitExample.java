/**
 * @author Solomon
 * @param args
 *
 */

package split2ArraysAndReturnUniquewords;


public class SplitExample {


	public static void main(String[] args) {
		String str1 = new String("We are working today from home"); 		// This is string 1
		String str2 = new String("Working from home is the best");			// This is string 2
		
		split2Strings(str1,str2);
	}
	
	public static void split2Strings(String str1, String str2) {
		
		str1.toLowerCase();													//Changing to to Lower Case
		str2.toLowerCase();													//Changing to to Lower Case
		
		String array1[]= str1.split(" ");									//Splitting string1 to the array1
		
		String array2[]= str2.split(" ");									//Splitting string2 to the array2
		
		printArray(array1);													//Printing the array
		
		printArray(array2);													//Printing the array
	}
	
	public static void printArray(String[] str ) {
		System.out.println("The string after split");
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
}

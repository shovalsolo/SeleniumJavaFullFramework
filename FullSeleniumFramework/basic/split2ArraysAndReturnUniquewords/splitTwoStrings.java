/**
 * @author Solomon
 * This class is for:
 * 1. split2Strings()- Getting 2 strings setting the strings to lower case and removing the punctuations, splitting them and returning  
 * 2. printArray()-  Getting a Array and printing it 
 */

package split2ArraysAndReturnUniquewords;


public class splitTwoStrings {

	public static String[] split2Strings(String str) {				//Clean and split function

		str = str.toLowerCase();									//Changing to to Lower Case
		
		str = str.replaceAll("\\p{Punct}",""); 

		String array1[]= str.split(" ");							//Splitting string1 to the array1																															//Printing the array
		
		return array1;
	}
	
	public static void printArray(String[] str ) {					//Print function						

		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
}

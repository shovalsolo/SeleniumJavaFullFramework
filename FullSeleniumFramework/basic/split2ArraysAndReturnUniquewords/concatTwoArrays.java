/**
 * @author Solomon
 * concatTwoArrays()- Getting 2 arrays and merging them to one array
 *
 */
package split2ArraysAndReturnUniquewords;


public class concatTwoArrays {

	public static String[] concat2Arrays(String[] str1,String[] str2) {
		String[] result = new String[str1.length+str2.length];				//Setting the size to be dynamic
		int i;
		for (i = 0; i < str1.length; i++) {									//populating the main array with the first array
			result[i] = str1[i];
		}
		
		int tempIndex = str1.length;										//populating the main array with the second array from the place we stopped 
		for (i = 0; i < str2.length; i++) {
			result[tempIndex+i] = str2[i];
		}
		
		return result;
	}
}

/**
 * @author Solomon
 * @param args
 *
 */

package split2ArraysAndReturnUniquewords;
import java.util.Arrays;
import java.util.LinkedHashSet;


public class SplitExample {


	public static void main(String[] args) {
		String str1 = new String("We are working today from home"); 		// This is string 1
		String str2 = new String("Working from home is the best");			// This is string 2
		
		split2Strings(str1,str2);											//Sending 2 strings to be converted to be 2 arrays
	}
	
	public static void split2Strings(String str1, String str2) {
		
		str1 = str1.toLowerCase();													//Changing to to Lower Case
		str2 = str2.toLowerCase();													//Changing to to Lower Case
		
		String array1[]= str1.split(" ");									//Splitting string1 to the array1
		
		String array2[]= str2.split(" ");									//Splitting string2 to the array2
		
		System.out.println("The string after split");
		printArray(array1);													//Printing the array
		
		printArray(array2);													//Printing the array
		
		concat2Arrays(array1,array2);
	}
	
	public static void printArray(String[] str ) {
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
	
	public static void concat2Arrays(String[] str1,String[] str2) {
		String[] result = new String[str1.length+str2.length];								//Setting the size to be dynamic
		int i;
		for (i = 0; i < str1.length; i++) {
			result[i] = str1[i];
		}
		
		int tempIndex = str1.length;
		for (i = 0; i < str2.length; i++) {
			result[tempIndex+i] = str2[i];
		}
		System.out.println("This is from concat 2 Arrays");
		printArray(result);
		RemoveDupWordsString(result);
	}
	
	public static void RemoveDupWordsString(String[] str1) {
		
		
        LinkedHashSet<String> lhSetWords = new LinkedHashSet<String>( Arrays.asList(str1) );	//convert String array to LinkedHashSet to remove duplicates
		
      
        StringBuilder sbTemp = new StringBuilder();												//join the words again by space
        int index = 0;
        
        for(String s : lhSetWords){
            
            if(index > 0) 
            {
            	sbTemp.append(" ");
            }
            sbTemp.append(s);
            index++;
        }
        
        sbTemp.toString();
        
        System.out.println("String after removing duplicate words: ");
        System.out.println(sbTemp);
	}
	
}

/**
 * @author Solomon
 * Converting String array to LinkedHashSet to remove duplicates
 */

package split2ArraysAndReturnUniquewords;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class cleanDupWordsString {
	
public static String RemoveDupWordsString(String[] str1) {
		
        LinkedHashSet<String> cleanSetWords = new LinkedHashSet<String>( Arrays.asList(str1) );	//Convert String array to LinkedHashSet to remove duplicates
        
        String cleanString = cleanSetWords.toString();											//Converting LinkedHashSet back to strings
        
        cleanString = cleanString.replaceAll("\\p{Punct}","");									//Cleaning from punctuations
        
        return cleanString;
	}
}

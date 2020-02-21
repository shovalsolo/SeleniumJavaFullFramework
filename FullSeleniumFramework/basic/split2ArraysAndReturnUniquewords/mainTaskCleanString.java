/**
 * @author Solomon
 * This is the main program that is using the following classes:
 * 1. splitTwoStrings
 * 2. concatTwoArrays
 * 3. cleanDupWordsString
 * 
 * Task: 
 * Parameters: string str1, string str2 (two sets of sentences of words)
 * Returns: a string consisting of words that appears in either set, but not both (disregarding for letter cases or punctuations)
 *
 */

package split2ArraysAndReturnUniquewords;

public class mainTaskCleanString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = new String("We!@ are(* working$% ##today &*from &&^home" ); 				// This is string 1 includes punctuation
		String str2 = new String("Working from home is the best");								// This is string 2 includes duplicate words
		
		System.out.println("First string is: "+str1 + "\n");
		System.out.println("Second string is: "+ str2 + "\n");
		
		String SplitedArray1[] = splitTwoStrings.split2Strings(str1);							//Splitting the string to an array
		String SplitedArray2[] = splitTwoStrings.split2Strings(str2);							//Splitting the string to an array
		
		//System.out.println("First after split");
		//splitTwoStrings.printArray(SplitedArray1);
		//System.out.println("Second after split");
		//splitTwoStrings.printArray(SplitedArray2);
		
		String MergedArray[] = concatTwoArrays.concat2Arrays(SplitedArray1, SplitedArray2);		//Concatenating the 2 arrays in to one array
		
		//System.out.println("After Merging the arrays");
		//splitTwoStrings.printArray(MergedArray);
		
		System.out.println("\n" + "After cleaning the strings");
		String cleanString = cleanDupWordsString.RemoveDupWordsString(MergedArray);				//Cleaning the array of duplicate words
		System.out.println(cleanString);
	}
}

/**
 * @author Solomon
 *
 */
package split2ArraysAndReturnUniquewords;


public class removePunctuations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Welcome???@@##$ to#$% Geeks%$^for$%^&Geeks";
		
		cleanPunctuations(str);

	}
	
	public static void cleanPunctuations(String str) {
		
		str = str.replaceAll("\\p{Punct}",""); 
		
		System.out.println(str); 
		
	} 
	

}

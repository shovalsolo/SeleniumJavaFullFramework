/* 
 * This class is showing about if , else if and else conditional statement 
 */

package conditionDemo;

public class conditionalIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 90;
		String browser = "Chrome";
		
		System.out.println("Test started");
		
		if (i>90) {
			System.out.println("Value is bigget then 90");
		}
		else if (i<90) {
			System.out.println("Value is less then 90");
		}
		else {
			System.out.println("Value is equal to 90");
		}
		
		////////////////////////////////////////////////////
		
		
		if (browser.equalsIgnoreCase("firefox")) {
			System.out.println("Browser = firefox");
		}
		else if (browser.equalsIgnoreCase("ie")) {
			System.out.println("Browser = Internet explorer");
		}
		else {
			System.out.println("Browser = Chrome");
		}
		
		
		System.out.println("Test end");
	}

}

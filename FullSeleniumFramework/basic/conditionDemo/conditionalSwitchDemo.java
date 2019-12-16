/* 
 * This class is showing about Switch case
 */

package conditionDemo;

public class conditionalSwitchDemo {

	public static void main(String[] args) {
		
		int x=4;
		
		switch (x) {
		case 1:
			System.out.println("Performence is poor x=1 ");
			break;
			
		case 2:
			System.out.println("Performence is slow x=2 ");
			break;

		case 3:
			System.out.println("Performence is fair x=3 ");
			break;
			
		case 4:
			System.out.println("Performence is good x=4 ");
			break;
			
		default:
			System.out.println("out of scope ");
			break;
		}

	}

}

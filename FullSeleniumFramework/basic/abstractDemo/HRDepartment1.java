/* 
 * This class is showing about abstract concept 
 * When extending the an abstract class we have to implement the method that abstract class did not implemented
 */

package abstractDemo;

public class HRDepartment1 extends ITDepartment {	//When extending the ITDepartment we have to implement the method that ITDepartment did not implemented

	public static void main(String[] args) {
		
		//ITDepartment it = new ITDepartment();		//Cannot create an object of an abstract class
		
		HRDepartment1 hr = new HRDepartment1();
		hr.bonus();									//using from ITDepartment
		hr.task();									//using from ITDepartment
		
		hr.salary();								//using from HRDepartment
		hr.work(); 									//using from HRDepartment
	}

	@Override
	public void salary() {							// This method has to be implemented when HRDepartment1 extends ITDepartment
		System.out.println("50000$");
	}
	
	public void work() {
		System.out.println("Car");
	}

}

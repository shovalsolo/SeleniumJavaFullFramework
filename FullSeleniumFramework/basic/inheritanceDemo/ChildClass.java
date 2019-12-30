/* 
 * This class is showing about inheritance extending BaseClass to inherit his functions
 * Creating an object of ChildClass as new ChildClass2 will give child functionality if the child is extending the parent 
 */

package inheritanceDemo;

public class ChildClass extends BaseClass{		//Extending the Base Class to inherit his functions

	public static void main(String[] args) {
		
		ChildClass ch1 = new ChildClass();		//Creating an object of ChildClass and we have access to the parent base class functions add and sub
		
		ch1.add();

		ch1.sub();
		
		ch1.mul();
		
		ch1.div();
		
	}
	
	public void mul() {
		System.out.println("Hey I'm from Child class and the multiplication is 2500");
	}
	
	public void div() {
		System.out.println("Hey I'm from Child class and the division is 50");
	}

}

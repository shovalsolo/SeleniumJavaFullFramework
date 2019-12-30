/* 
 * This class is showing about inheritance extending BaseClass to inherit his functions 
 * Creating an object of BaseClass as new ChildClass2 will not give child functionality 
 */

package inheritanceDemo;

public class ChildClass2 extends BaseClass{		//Extending the Base Class to inherit his functions

	public static void main(String[] args) {
		
		BaseClass ch1 = new ChildClass2();		//Creating an object of BaseClass as new ChildClass2 and we have access to the parent base class functions add and sub and not to mul and div
		
		ch1.add();

		ch1.sub();
		
		//ch1.mul();
		
		//ch1.div();
		
	}
	
	public void mul() {
		System.out.println("Hey I'm from Child class and the multiplication is 2500");
	}
	
	public void div() {
		System.out.println("Hey I'm from Child class and the division is 50");
	}

}

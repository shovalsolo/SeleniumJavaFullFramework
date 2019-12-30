/* 
 * This class is showing about inheritance
 * Creating an object of BaseClass will not give child functionality 
 */

package inheritanceDemo;

public class ChildClass1 extends BaseClass{		//Extending the Base Class to inherit his functions

	public static void main(String[] args) {
		
		BaseClass bc1 = new BaseClass();		//Creating an object of BaseClass and we have access to the parent base class functions add and sub and not to mul and div
		
		bc1.add();

		bc1.sub();
		
		//bc1.mul();
		
		//bc1.div();
		
	}
	
	public void mul() {
		System.out.println("Hey I'm from Child class and the multiplication is 2500");
	}
	
	public void div() {
		System.out.println("Hey I'm from Child class and the division is 50");
	}

}

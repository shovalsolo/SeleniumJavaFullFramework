/* 
 * This class is showing about abstract concept 
 * 1. A class is an abstract class even if it has even one abstract function
 * 2. When we don't want to implement a function from the interface we are removing the body and adding abstract to the method
 * 3. When we add abstract to one function the class becomes an abstract class
 * 4. We cannot create an object of an abstract class
 */

package abstractDemo;

public abstract class ITDepartment implements Employee{	// This class is implementing the employee interface and his empty classes

	public static void main(String[] args) {
		

	}

	public abstract void salary();			//Coming from Employee interface but we don't want to implement it so we are adding abstract and removing the body and the class also becomes an abstract class
	

	public void bonus() {					//Coming from Employee interface
		
		System.out.println("Has one laptop");
	}

	public void task() {					//Coming from Employee interface
		
		System.out.println("Has one task");
	}

}

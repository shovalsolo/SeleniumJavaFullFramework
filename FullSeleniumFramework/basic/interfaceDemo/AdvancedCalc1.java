/* 
 * This class is showing about interface use
 * This class is using CalcInterface as an Interface
 * When creating an interface object you can access only the interface functions and not the class functions
 */

package interfaceDemo;

public class AdvancedCalc1 implements CalcInterface {	//When implementing the interface it is creating the functions from the interface to the class
	
	public static void main(String[] args) {
		
		CalcInterface ac1 = new AdvancedCalc1();
		
		ac1.add();										//Calling a function that is created in the interface and implemented in the advanced class
		
		ac1.sub();										//Calling a function that is created in the interface and implemented in the advanced class
		
		//ac1.calculateSin();								//Calling a function that is created in the class
		
		//ac1.calculateCos();								//Calling a function that is created in the class
	}
	
	public void calculateSin() {						//A function that is local and not coming from the interface
		System.out.println("I'm in the Advanced Calc - Sin method");
	}
	
	public void calculateCos() {						//A function that is local and not coming from the interface
		System.out.println("I'm in the Advanced Calc - Cos method");
	}

	public void add() {									//Function that is coming from the interface when implementing it
		System.out.println("I'm in the addition method");
	}

	public void sub() {									//Function that is coming from the interface when implementing it
		System.out.println("I'm in the subtraction method");
	}
	
}

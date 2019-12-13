/* 
 * This class is showing the use of 
 * 1. A float variable takes from approximately +-3.40282347E+38F
 * 2. A double variable takes from approximately +-1.79769313486231570E+308
 */

package dataTypeDemo;

public class VariableFloatDemo {
	
	public static void main (String[] args) {
		
		float my_marks=(float) 66.89;				// When you have fraction you can either cast to float use double
		
		float my_mark=66.89f;						// WEhen you have fraction you can either cast to float use double or add a f to set as float
		
		double my_new_marks=4544.78;				// A double variable takes from approximately +-1.79769313486231570E+308
	
		System.out.println("my_marks are: "+my_marks+" and "+"my_mark is: "+my_mark+" and "+"my_new_marks are: "+my_new_marks);	//printing the content of the variables
	}

}

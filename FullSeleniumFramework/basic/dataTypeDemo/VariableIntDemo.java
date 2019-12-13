/* 
 * This class is showing the use of byte , short , int and long
 * 1. A byte variable takes from -128 to 127
 * 2. A short variable takes from -32768 to 32676
 * 3. A int variable takes from -2,147,483,648 to 2,147,483,648
 * 4. A long variable takes from -9,233,372,036,854,775,808 to 9,233,372,036,854,775,808
 * 5. Downcasting: is when casting from higher data type to lower data type
 */

package dataTypeDemo;

public class IntDemo {
	
	public static void main (String[] args) {
		
		byte marks=98; 						// A byte variable takes from -128 to 127
		
		//byte total=150;					// A byte variable takes from -128 to 127 when you give more you will get an error
		
		short total=150;					// A short variable takes from -32768 to 32676
		
		int total_all=50000;				// A int variable takes from -2,147,483,648 to 2,147,483,648
		
		long mobile=989989888;				// A long variable takes from -9,233,372,036,854,775,808 to 9,233,372,036,854,775,808
		
		int a=(int) 45.21;					// If you have a fraction and you will cast to int it will cut the fraction after the dot. this is called downcasting
		
		System.out.println("marks is: "+ marks + "  -and-  "+"total is: "+ total + "  -and-  "+"total_all is: "+ total_all+ "  -and-  "+"mobile is: "+ mobile);	//printing the content of the variables
	
		System.out.println("a is: "+ a);	// If you have a fraction and you will cast to int it will cut the fraction after the dot.
	}

}

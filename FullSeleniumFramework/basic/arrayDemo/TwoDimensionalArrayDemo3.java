/* 
 * This class is showing about TwoDimensional arrays how to create populate 
 */
package arrayDemo;

public class TwoDimensionalArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int school[][] = new int[2][3];			//the first part is rows and the second one is columns [rows][columns]
		
		school[0][0]=5;							//Populating the cell in the array with number
		school[0][1]=10;
		school[0][2]=15;
		school[1][0]=20;
		school[1][1]=25;
		school[1][2]=30;
		
		System.out.println("School ID is: "+ school[1][2]);
		System.out.println("Printing the School Array ");
		
		for (int i = 0; i < school.length; i++) {					//printing the array
			for (int j = 0; j < school.length+1; j++) {				//Adding +1 to print all the array
				System.out.println("School ID is: "+ school[i][j]);
			}
		}
	}

}

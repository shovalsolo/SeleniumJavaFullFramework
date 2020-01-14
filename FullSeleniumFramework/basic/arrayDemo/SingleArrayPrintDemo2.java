/* 
 * This class is showing about arrays how to print the content of the array using a for loop
 * Showing downcasting
 */

package arrayDemo;

public class SingleArrayPrintDemo2 {

	public static void main(String[] args) {
		
		int a=100;
		int b=90;
		int c=89;
		int student_id[] = new int[5];		 //will take 20byte of memory
		String student_name[]=new String[5]; //Creating an array of empty strings will contain nulls
		
		student_id[0]=c;					//Populating the cell in the array with parameter
		student_id[1]=45;					//Populating the cell in the array with number
		student_id[2]=a;
		student_id[3]=(int) 88.3;			//Populating the cell in the array and downcasting to int
		student_id[4]=b;		
		int sizeOfArray = student_id.length;//Setting a param with the sizr of the array
		
		System.out.println("Length of array is : "+ sizeOfArray);
		
		for (int i = 0; i < student_id.length; i++) {	//Printing the size of the array
			System.err.println("Student ID in cell: "+i+" is: "+student_id[i] );
		}
		
		
	}

}

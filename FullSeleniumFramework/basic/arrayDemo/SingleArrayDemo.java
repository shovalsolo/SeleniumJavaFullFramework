/* 
 * This class is showing about arrays how to populate
 *  
 */

package arrayDemo;

public class SingleArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		int b=90;
		int c=89;
		int student_id[] = new int[5];	//will take 20byte of memory
		String student_name[]=new String[5]; //Creating an array of strings
		
		student_id[0]=c;					//Populating the cell in the array with parameter
		student_id[1]=45;				//Populating the cell in the array with number
		student_id[2]=a;
		student_id[3]=(int) 88.3;		//Populating the cell in the array and downcasting to int
		student_id[4]=b;
		System.out.println("Student ID is: "+student_id[4]);
		
		
	}

}

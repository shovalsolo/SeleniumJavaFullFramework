/* 
 * This is a class that Calling a class and sending parameters of file location and sheet name
 * getCellDataString- can handle only strings
 * getCellDataNumber- can handle only integers
 */

package utils;

public class ExcelUtilsDemo {

	public static void main(String[] args) {

		String projectPath = System.getProperty("user.dir"); 							//holding the path to the project
		ExcelUtils excel = new ExcelUtils(projectPath+"/excel/data1.xlsx", "sheet1");	//Creating an instance of the class and giving file location and sheet name
		excel.getRowCount();															//Calling function to get number of rows in the sheet
		excel.getColCount();
		excel.getCellDataString(0,0);													//Sending location to print string in cell
		excel.getCellDataString(0,1);													//Sending location to print string in cell
		excel.getCellDataString(1,0);													//Sending location to print string in cell
		excel.getCellDataNumber(1,1);													//Sending location to print integer in cell
	}
}

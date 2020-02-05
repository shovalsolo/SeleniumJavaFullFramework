/* 
 * This is a class that is getting information from excel file data.xlsx and this class is called from ExcelUtilsDemo
 * Using 
 * 1. XSSFWorkbook 
 * 2. XSSFSheet
 */

package utils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelPath, String sheetName ) {						//Contractor that is getting 2 parameters file location and sheet name
		try {
			workbook = new XSSFWorkbook(excelPath);									//Creating an XSSFWorkbook instance for excel.xslx files
			sheet = workbook.getSheet(sheetName);									//Creating an XSSFSheet and giving the sheet name
		} 
		catch (Exception e) {
			System.out.println("Message is : " +e.getMessage());					//Printing the exception message
			System.out.println("Couse is : " +e.getCause());						//Printing the exception cause
			e.printStackTrace();													//Will print the line of the error
		}
	}
	
	public static int getRowCount() {												//This function will print the number or rows in a sheet
		int rowCount = 0;
		
		try {
			rowCount =  sheet.getPhysicalNumberOfRows();							//Saving the number of rows to a parameter
			System.out.println("Number of rows:  "+ rowCount); 						//Printing the number of rows
		} 
		catch (Exception e) {
			System.out.println("Message is : " +e.getMessage());					//Printing the exception message
			System.out.println("Couse is : " +e.getCause());						//Printing the exception cause
			e.printStackTrace();													//Will print the line of the error
		}		
		return rowCount;
	}
	
	public static int getColCount() {												//This function will print the number or columns in a sheet
		int colCount = 0;
		
		try {
			colCount =  sheet.getRow(0).getPhysicalNumberOfCells();					//Saving the number of columns to a parameter
			System.out.println("Number of columns:  "+ colCount); 					//Printing the number of columns
		} 
		catch (Exception e) {
			System.out.println("Message is : " +e.getMessage());					//Printing the exception message
			System.out.println("Couse is : " +e.getCause());						//Printing the exception cause
			e.printStackTrace();													//Will print the line of the error
		}	
		return colCount;
	}
	
	public static String getCellDataString(int rowNum, int colNum) {				//This function will print a string data in a sheet
		
		String cellData= null;
		try {
			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();	//Getting the cell data to a string parameter
			System.out.println(cellData);	
		} 
		catch (Exception e) {
			System.out.println("Message is : " +e.getMessage());					//Printing the exception message
			System.out.println("Couse is : " +e.getCause());						//Printing the exception cause
			e.printStackTrace();													//Will print the line of the error
		}
		return cellData;
	}
	
	public static Double getCellDataNumber(int rowNum, int colNum) {				//This function will print a string data in a sheet
		
		Double cellData = 0.0;
		try {
			cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();	//Getting the cell data to a string parameter
			System.out.println(cellData);	
		} 
		catch (Exception e) {
			System.out.println("Message is : " +e.getMessage());					//Printing the exception message
			System.out.println("Couse is : " +e.getCause());						//Printing the exception cause
			e.printStackTrace();													//Will print the line of the error
		}
		return cellData;
	}

}

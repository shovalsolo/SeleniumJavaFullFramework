/* 
 * This is a class that is getting data from excel file with the help of class ExcelUtils and performing login to site with data from the excel
 * Using dataProvider
 */

package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataProvider {
	
	String projectPath = System.getProperty("user.dir"); 						//Setting the path to the file
	static WebDriver driver = null;												//Creating a new driver
	
	@BeforeTest
	public void setUpTest() {
		WebDriverManager.chromedriver().setup();								//Initializing the webdriver
		driver = new ChromeDriver();											//
	}

	@Test(dataProvider="testData")												//Using testNG and giving the DataProvider and will call the second test 
	public void test1(String username, String password) throws Exception {		//Providing the titles of the table
		System.out.println(" | "+username+"  |  "+password+" | ");				//Printing the parameters 
		driver.get("https://opensource-demo.orangehrmlive.com/");				//Navigating to a site
		driver.findElement(By.id("txtUsername")).sendKeys(username);			//Locating the username field and sending the keys
		driver.findElement(By.id("txtPassword")).sendKeys(password);			//Locating the password field and sending the keys
		Thread.sleep(2000);														//Wait of 2 seconds 
		driver.findElement(By.id("btnLogin")).click(); 							//Click on the login button
		Thread.sleep(2000);														//Wait of 2 seconds 
	}

	@DataProvider(name = "testData")											//TestNG DataProvider
	public Object[][] getData() {												//A function that
		Object data[][] = testData(projectPath+"/excel/data.xlsx", "sheet1");	//Calling the function
		return data;
	}

	public static Object[][] testData(String excelPath, String sheetName) {		//A function that is looping over the array and returning an object array

		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);				//Creating an excel object and providing file path and sheet name

		int rowCount =  excel.getRowCount();									//Saving number of rows in a parameter
		int colCount = excel.getColCount();										//Saving number of columns in a parameter

		Object data[][] = new Object[rowCount-1][colCount];						//Creating an object array with the size of the parameters - rowCount-1 because we don't need the title of the table

		for (int i = 1; i < rowCount; i++) {									//The loop will skip the title of the excel why we start at i=1

			for (int j = 0; j < colCount; j++) {								//The loop will start at the second row in the first cell

				String cellData =  excel.getCellDataString(i,j);				//Saving the data every loop to parameter
				//System.out.print(cellData+"  |  ");								//Printing the parameter with space
				data[i-1][j]= cellData;											//Saving the data to the object array

			}
			System.out.println();												//Printing next row
		}
		return data;
	}
	
	@AfterSuite																				// Will run only one time if you have multiple tests only in the end 
	public void tearDown() {																//A func to close the browser session
		driver.close();																		//Closing the browser
		driver.quit();																		//Closing the process
		System.out.println("Test completed Successfully");
	}
	
}

/* 
 * This is a demo test to show about radio button and dropdown list selecting
 */
package buildingBlocks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class RegisterDemoWebShop {
	
	static WebDriver driver = null;

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");											// creating a parameter of the path to the chrome driver
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");//the location of the chrome driver
		
		driver = new ChromeDriver();
		
		try {
			
			driver.get("http://automationpractice.com/index.php");										// Navigating to URL
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);							//Setting timer to 10 seconds
			driver.findElement(By.xpath("//a[@class='login']")).click();		
			driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("QA_Test3@gmail.com");	//Send Keys to email field
			driver.findElement(By.xpath("//form[@id='create-account_form']//span[1]")).click();			//Find by id and click
			driver.findElement(By.id("id_gender1")).click();											//Select Radio button
			driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("QA");			//Send Keys to first name field
			driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Test");			//Send Keys to last name field		
			driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("qatest");					//Send Keys to password field
			driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("qatestaddress1");			//Send Keys to address1 field
			driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("qatestaddress2");			//Send Keys to address2 field
		
			try {
				Thread.sleep(3000);
				Select dropdown = new Select(driver.findElement(By.id("id_state")));					//Select from dropdown
				dropdown.selectByIndex(53);
				
			} 
			catch (Exception e) {
				System.out.println("Select from dropdown failed");
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
			}
			
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys("qatestcity");					//Send Keys to city field
			driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("12345");					//Send Keys to post code field
			driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("1234554321");			//Send Keys to phone_mobile field
			driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("qatestaddress");				//Send Keys to alias field
			driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();				//Click on Register
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//a[@class='logout']")).click();								//Click on logout
			Thread.sleep(5000);
			
		} 
		catch (InterruptedException e) {
			System.out.println("Test Failed");
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		
		driver.close();																						//close the window
		driver.quit();
	}
}

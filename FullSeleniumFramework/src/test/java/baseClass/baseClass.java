/* 
 * A base class is a class is a class that is being extended by other classes to do an action one time
 * @BeforeMethod and AfetrMethod will run after every function
 * @BeforeClass and @AfterClass will run only in the beginning of the class and in the end of it
 * 
 */

package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	
	WebDriver driver;
	
	@BeforeClass
	public void setupApplication() {
		Reporter.log("=======Setup browser Started=======",true);
		WebDriverManager.chromedriver().setup();										//
		driver = new ChromeDriver();													//
		Reporter.log("=======Setup browser End=======",true);
	}
	
	@AfterClass
	public void CloseApplication() {
		Reporter.log("=======Closing Browser Session started=======",true);
		
		driver.close();
		driver.quit();
		
		Reporter.log("=======Closing Browser Session End=======",true);
	}

}

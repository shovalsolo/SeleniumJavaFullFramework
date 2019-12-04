/* 
 * This class TestBase - is calling Driver class To run the before and after class Initialize and close
 * 
 */

package UniversalWebDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
	
	@BeforeClass								//This will Initialize the webdriver
	public void setup() {
		Driver.InitializeDriver();
	}
	
	@AfterClass
	public void cleanup() throws Exception {	//This will close the browser
		Driver.closeBrowser();
		Driver.quitBrowser();
	}

}

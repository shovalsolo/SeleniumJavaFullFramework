/* 
 * This test is running on docker with zalenium container
 * Adding DesiredCapabilities to set the information to the browser and the name of the test
 * To run this TC use testng12.xml and it will run in parallel tests on 2 nods using docker zalenium container
 */


package zalenium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class dockerGoogleSearchFireFox {
	static RemoteWebDriver driver;
	
	@BeforeClass
	public void setUp() throws MalformedURLException{
		System.out.println("Running test in Docker Container << firefox >>");
		
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setPlatform(Platform.LINUX);
		cap.setVersion("");
		cap.setCapability("zal:name", "firefox Searching in google");
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"),cap);	//will use port 4444 to run from the hub to the correct node
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test (description= "Searching in google")
	public void googleSearch() throws InterruptedException {
		
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Rock music");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		System.out.println("Search in firefox Completed");
		
		Thread.sleep(5000);
		driver.close();
		//driver.quit();
	}
	
	public static void tearDown() throws Exception {
		if (driver!=null) {
			System.out.println("Completed Test in Docker Container  << firefox >>");
		}
	}
}

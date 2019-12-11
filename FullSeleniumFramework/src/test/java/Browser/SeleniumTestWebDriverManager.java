package Browser; // WebDriver Manager is a library that is replacing the the path to the physical driver

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import screenShotPrintScreen.ScreenshotHandler;

public class SeleniumTestWebDriverManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumhq.org/");																// Navigating to URL
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);									//Setting timer to 10 seconds
		
		driver.close();																						//close the window
		driver.quit();
		
		/* Other browsers
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.operadriver().setup();
		WebDriverManager.phantomjs().setup();
		WebDriverManager.edgedriver().setup();
		WebDriverManager.iedriver().setup();
		*/
	}

}

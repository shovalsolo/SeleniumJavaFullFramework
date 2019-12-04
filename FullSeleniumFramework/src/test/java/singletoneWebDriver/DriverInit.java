/* 
 * This class Driver Initializing of webDriver in a singleton pattern
 * The difference between a normal class and a singleton class:
 * For normal class we use constructor to create an instance of the class object
 * In singleton class we use getInstance() method to create an instance of the class object
 */
package singletoneWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverInit {
	
	private static DriverInit instanceDriver = null;		//Creating an object parameter of the class
	private WebDriver driver;
	
	private DriverInit() {									//Empty Constructor without Initializing
		
	}

	public WebDriver openBrowser() {						//A method that is Initializing the webDriver 
		if (driver == null) {
			ChromeOptions options = new ChromeOptions();						//Creating an object of chrome options
			options.addArguments("--disable-notifications");					//Setting an argument to disable notifications in the browser
			options.setPageLoadStrategy(PageLoadStrategy.NONE);					//Setting PageLoadStrategy to none preventing the page from loading while executing
			WebDriverManager.chromedriver().setup();							//Setting ChromeDriver
			driver = new ChromeDriver(options);									//Setting ChromeDriver to driver
			driver.manage().window().maximize();								//Setting the window to maximum
			driver.manage().deleteAllCookies(); 								//Deleting all the cookies
			driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);	//Setting implicitlyWait of 45 seconds
			driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);	//Setting pageLoadTimeout of 45 seconds 
		}
		return driver;										//returning driver
	}
	
//	public WebDriver openBrowser(String browserName) {
//		if (driver == null) {
//			System.out.println("driver == null");
//			if (browserName.equalsIgnoreCase("ie")) {
//				WebDriverManager.iedriver().setup();
//				driver = new InternetExplorerDriver();								//Setting the driver to IE
//				driver.manage().window().maximize();								//Setting the window to maximum
//				driver.manage().deleteAllCookies(); 								//Deleting all the cookies
//				driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);	//Setting implicitlyWait of 45 seconds
//				driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);	//Setting pageLoadTimeout of 45 seconds
//			}
//			else if (browserName.equalsIgnoreCase("firefox")) {
//				WebDriverManager.firefoxdriver().setup();
//				driver.manage().window().maximize();								//Setting the window to maximum
//				driver.manage().deleteAllCookies(); 								//Deleting all the cookies
//				driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);	//Setting implicitlyWait of 45 seconds
//				driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);	//Setting pageLoadTimeout of 45 seconds 
//			}
//			else if(browserName.equalsIgnoreCase("chrome")){
//				WebDriverManager.chromedriver().setup();							//Setting the WebDriverManager
//				driver = new ChromeDriver();										//Setting the driver to ChromeDriver
//				driver.manage().window().maximize();								//Setting the window to maximum
//				driver.manage().deleteAllCookies(); 								//Deleting all the cookies
//				driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);	//Setting implicitlyWait of 45 seconds
//				driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);	//Setting pageLoadTimeout of 45 seconds
//			}
//		}
//		
//		return driver;
//	}
	
	public static DriverInit getInstance() {				//Get instance method
		if (instanceDriver == null)							//If instanceDriver is null 
			instanceDriver = new DriverInit();				//Initializing instanceDriver with the object of DriverInit
		return instanceDriver;								//Returning instanceDriver
	}
}

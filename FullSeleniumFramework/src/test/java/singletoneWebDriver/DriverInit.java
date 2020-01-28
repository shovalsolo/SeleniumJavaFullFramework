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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverInit {
	
	private static DriverInit instanceDriver = null;							//Creating an object parameter of the class
	private WebDriver driver;
	public String projectPath = System.getProperty("user.dir");					//Creating a parameter of the path to the firefox driver
	
	private DriverInit() {														//Empty Constructor without Initializing
	}
	
	public WebDriver openBrowser() {											//A method that is Initializing the webDriver to Chrome when not sending a parameter
		if (driver == null) {
			Reporter.log("=======Initializing browser no parameter Started=======",true);
			ChromeOptions options = new ChromeOptions();						//Creating an object of Chrome options
			options.addArguments("--disable-notifications");					//Setting an argument to disable notifications in the browser
			options.setPageLoadStrategy(PageLoadStrategy.NONE);					//Setting PageLoadStrategy to none preventing the page from loading while executing
			WebDriverManager.chromedriver().setup();							//Setting ChromeDriver
			driver = new ChromeDriver(options);									//Setting ChromeDriver to driver
			driver.manage().window().maximize();								//Setting the window to maximum
			driver.manage().deleteAllCookies(); 								//Deleting all the cookies
			driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);	//Setting implicitlyWait of 45 seconds
			driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);	//Setting pageLoadTimeout of 45 seconds 
			Reporter.log("=======Initializing browser no parameter Ended=======",true);
		}
		return driver;															//returning driver when browser was not sent the default is Chrome
	}
	
	public WebDriver openBrowser(String browserName) {								//Overloading the openBrowser function with browser option parameter
		if (driver == null) {
			System.out.println("driver == null");
			if (browserName.equalsIgnoreCase("ie")) {
				Reporter.log("=======Initializing IE Started=======",true);
				DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();									//Creating DesiredCapabilities
				capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);	//Setting capabilities to ignore security domains
				WebDriverManager.iedriver().setup();								//Setting driver to IE
				driver = new InternetExplorerDriver(capabilities);					//Setting the driver to IE
				driver.manage().window().maximize();								//Setting the window to maximum
				driver.manage().deleteAllCookies(); 								//Deleting all the cookies
				driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);	//Setting implicitlyWait of 45 seconds
				driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);	//Setting pageLoadTimeout of 45 seconds
				Reporter.log("=======Initializing IE Ended=======",true);
			}
			else if (browserName.equalsIgnoreCase("firefox")) {
				Reporter.log("=======Initializing Firefox Started=======",true);
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();										//Setting ChromeDriver to driver
				driver.manage().window().maximize();								//Setting the window to maximum
				driver.manage().deleteAllCookies(); 								//Deleting all the cookies
				driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);	//Setting implicitlyWait of 45 seconds
				driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);	//Setting pageLoadTimeout of 45 seconds 
				Reporter.log("=======Initializing Firefox Ended=======",true);
			}
			else if(browserName.equalsIgnoreCase("chrome")){
				Reporter.log("=======Initializing Chrome Started=======",true);
				WebDriverManager.chromedriver().setup();							//Setting the WebDriverManager
				driver = new ChromeDriver();										//Setting the driver to ChromeDriver
				driver.manage().window().maximize();								//Setting the window to maximum
				driver.manage().deleteAllCookies(); 								//Deleting all the cookies
				driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);	//Setting implicitlyWait of 45 seconds
				driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);	//Setting pageLoadTimeout of 45 seconds
				Reporter.log("=======Initializing Chrome Ended=======",true);
			}
			else {
				WebDriverManager.chromedriver().setup();							//Setting the WebDriverManager
				Reporter.log("=======Initializing Chrome Started=======",true);
				driver = new ChromeDriver();										//Setting the driver to ChromeDriver
				driver.manage().window().maximize();								//Setting the window to maximum
				driver.manage().deleteAllCookies(); 								//Deleting all the cookies
				driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);	//Setting implicitlyWait of 45 seconds
				driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);	//Setting pageLoadTimeout of 45 seconds
				Reporter.log("=======Initializing Chrome Ended=======",true);
			}
		}
		return driver;
	}
	
	public static DriverInit getInstance() {										//Get instance method
		if (instanceDriver == null)													//If instanceDriver is null empty
			instanceDriver = new DriverInit();										//Initializing instanceDriver with the object of DriverInit
		return instanceDriver;														//Returning instanceDriver
	}
}

package UniversalWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	public static WebDriver Instance = null;
	

	public static void InitializeDriver() {		//A function to Initialize the browser
		if (Instance == null) {					//This is a singleton instance of webdriver we will only have it once in the project
			if (Configuration.BrowserType.browser.equalsIgnoreCase("ff")) {
				System.out.println("Initializing Firefox driver");
				WebDriverManager.firefoxdriver().setup();
				Instance = new FirefoxDriver();
			}
			else if (Configuration.BrowserType.browser.equalsIgnoreCase("ie")) {
				System.out.println("Initializing internet explorer driver");
				WebDriverManager.iedriver().setup();
				Instance = new InternetExplorerDriver();
			}
			else if (Configuration.BrowserType.browser.equalsIgnoreCase("chrome")) {
				System.out.println("Initializing Firefox driver");
				WebDriverManager.chromedriver().setup();
				Instance = new ChromeDriver();
			}
		}

		Instance.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Instance.manage().window().maximize();
		System.out.println("Driver Initialized");

	}
	
	public static void closeBrowser() {						//A function to close the browser
		System.out.println("Closing the browser");
		Instance.close();
		Instance= null;
	}
	
	public static void quitBrowser() {						//A function to quit the browser
		System.out.println("Quiting the browser");
		Instance.quit();
		Instance= null;
	}
	
}

/* 
 * This Class is triggered from Jenkins and is activated by a job
 */

package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import screenShotPrintScreen.ScreenshotManager;

public class TestShowcaseDesignersSite {
	
	public static WebDriver driver = null;
	public static String projectPath = System.getProperty("user.dir");
	static ExtentHtmlReporter htmlReporter;
	static ExtentReports extent;

	@BeforeClass																			//This will run before the class
	public void setUp() {																	//Function that is calling the driver init				
		try {
			Reporter.log("=======setUp Started=======",true);
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();									//Creating an object of ChromeOptions						$$$
			options.addArguments("window-size=1080,720");									//Setting the argument for window-size to options object	$$$
			driver = new ChromeDriver(options);												//Passing the options object the the ChromeDriver			$$$								//Setting the browser selected and calling the function from the 
			htmlReporter = new ExtentHtmlReporter(projectPath+"/reports/TestShowcaseDesignersSite.html");//start reporters and setting the file name for the report
			extent = new ExtentReports();													// create ExtentReports
			extent.attachReporter(htmlReporter);											// Attach reporter(s)
			ExtentTest logger1 = extent.createTest("setUp", "setUp");
			logger1.log(Status.INFO, "setUp");
			Reporter.log("=======setUp Ended=======",true);
		} 
		catch (Exception e) {
			Reporter.log("=======setUp Failed=======",true);
			ScreenshotManager.cuptureScreenshot(driver , "setUp-Failed");
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());								//Message of the exception
			System.out.println("Cause is " + e.getCause());									//Cause of the exception
		}
	}
	
	@Test(priority = 1)
	public static void openUrl() {
		ExtentTest test1 = extent.createTest("openUrl", "openUrl");	
		try {
			Reporter.log("=======openUrl Started=======",true);
			driver.get("http://localhost:8181/Design/");					//Navigate to url original before fix http://localhost:8181/Design/  OR   https://shovalsolo.github.io/ShowcaseDesigners/
			System.out.println(driver.getTitle());											//Will print the title of the page
			Thread.sleep(5000);
			Reporter.log("=======openUrl Ended=======",true);
			test1.pass("openUrl Passed");
		} 
		catch (InterruptedException e) {
			Reporter.log("=======openUrl Failed=======",true);
			ScreenshotManager.cuptureScreenshot(driver , "openUrl-Failed");
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());								//Message of the exception
			System.out.println("Cause is " + e.getCause());
			test1.fail("openUrl failed");
		}																
	}
	
	@Test(priority = 2)
	public static void clickOnShowcase() {
		ExtentTest test2 = extent.createTest("clickOnShowcase", "clickOnShowcase");
		try {
			Reporter.log("=======clickOnShowcase Started=======",true);															//Wait to see the results
			driver.findElement(By.xpath("//a[contains(text(),'Showcase')]")).click();		//Sending keys to field
			Thread.sleep(5000);
			Reporter.log("=======clickOnShowcase Ended=======",true);
			test2.pass("clickOnShowcase Passed");
		} 
		catch (InterruptedException e) {
			Reporter.log("=======clickOnShowcase Failed=======",true);
			ScreenshotManager.cuptureScreenshot(driver , "clickOnShowcase-Failed");
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());								//Message of the exception
			System.out.println("Cause is " + e.getCause());
			test2.fail("clickOnShowcase failed");
		}																
	}
	
	@Test(priority = 3)
	public static void clickOnServices() {
		ExtentTest test3 = extent.createTest("clickOnServices", "clickOnServices");
		try {
			Reporter.log("=======clickOnServices Started=======",true);
			driver.findElement(By.xpath("//a[contains(text(),'Services')]")).click();		//Sending keys to field
			Thread.sleep(5000);
			Reporter.log("=======clickOnServices Ended=======",true);
			test3.pass("clickOnServices Passed");
		} 
		catch (InterruptedException e) {
			Reporter.log("=======clickOnServices Failed=======",true);
			ScreenshotManager.cuptureScreenshot(driver , "clickOnServices-Failed");
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());								//Message of the exception
			System.out.println("Cause is " + e.getCause());
			test3.fail("clickOnServices failed");
		}																
	}
	
	@Test(priority = 4)
	public static void clickOnDesigners() {
		ExtentTest test4 = extent.createTest("clickOnDesigners", "clickOnDesigners");
		try {
			Reporter.log("=======clickOnDesigners Started=======",true);
			driver.findElement(By.xpath("//a[contains(text(),'Designers')]")).click();		//Sending keys to field
			Thread.sleep(5000);
			Reporter.log("=======clickOnDesigners Ended=======",true);
			test4.pass("clickOnDesigners Passed");
		} 
		catch (InterruptedException e) {
			Reporter.log("=======clickOnDesigners Failed=======",true);
			ScreenshotManager.cuptureScreenshot(driver , "clickOnDesigners-Failed");
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());								//Message of the exception
			System.out.println("Cause is " + e.getCause());
			test4.fail("clickOnDesigners failed");
		}																
	}
	
	@Test(priority = 5)
	public static void clickOnPackages() {
		ExtentTest test5 = extent.createTest("clickOnPackages", "clickOnPackages");
		try {
			Reporter.log("=======clickOnPackages Started=======",true);
			driver.findElement(By.xpath("//a[contains(text(),'Packages')]")).click();		//Sending keys to field
			Thread.sleep(5000);
			Reporter.log("=======clickOnPackages Ended=======",true);
			test5.pass("clickOnPackages Passed");
		} 
		catch (InterruptedException e) {
			Reporter.log("=======clickOnPackages Failed=======",true);
			ScreenshotManager.cuptureScreenshot(driver , "clickOnPackages-Failed");
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());								//Message of the exception
			System.out.println("Cause is " + e.getCause());
			test5.fail("clickOnPackages failed");
		}																
	}
	
	@Test(priority = 6)
	public static void clickOnContact() {
		ExtentTest test6 = extent.createTest("clickOnContact", "clickOnContact");
		try {
			Reporter.log("=======clickOnContact Started=======",true);
			driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();		//Sending keys to field
			Thread.sleep(5000);
			Reporter.log("=======clickOnContact Ended=======",true);
			test6.pass("clickOnContact Passed");
		} 
		catch (InterruptedException e) {
			Reporter.log("=======clickOnContact Failed=======",true);
			ScreenshotManager.cuptureScreenshot(driver , "clickOnContact-Failed");
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());								//Message of the exception
			System.out.println("Cause is " + e.getCause());
			test6.fail("clickOnContact failed");
		}																
	}
	
	@AfterClass																				//This will run after the class
	public void tearDown() {																//Function to close the browser
		try {
			Reporter.log("=======tearDown Started=======",true);
			ExtentTest logger2 = extent.createTest("tearDown", "tearDown");
			logger2.log(Status.WARNING, "Running flush report last");
			extent.flush();
			driver.close();																	//Closing the browser
			driver.quit();																	//Closing the process 
			System.out.println("Test completed successfully");								//Printing message
			Reporter.log("=======tearDown Ended=======",true);
		} 
		catch (Exception e) {
			Reporter.log("=======tearDown Failed=======",true);
			ScreenshotManager.cuptureScreenshot(driver , "tearDown-Failed");
			e.printStackTrace();
			System.out.println("Message is " + e.getMessage());								//Message of the exception
			System.out.println("Cause is " + e.getCause());									//Cause of the exception
		}
	}
}

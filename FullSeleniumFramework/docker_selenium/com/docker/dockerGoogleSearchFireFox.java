/* 
 * This test is running on docker container on local machine
 * Adding DesiredCapabilities to set the information to the browser
 * To run this TC use testng9.xml and it will run in parallel both dockerGoogleSearchChrome and dockerGoogleSearchFirefox 
 * This will run on selenium/standalone-firefox-debug 4646:5904
 */

package com.docker;

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
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4646/wd/hub"),cap);		//will use port 4646 to run
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

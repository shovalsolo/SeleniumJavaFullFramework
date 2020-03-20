/* 
 * This test is running on docker container on local machine
 * Adding DesiredCapabilities to set the information to the browser
 * To run this TC use testng11.xml and it will run in parallel tests on 4 nods using docker compose
 */

package com.docker.compose;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class dockerGoogleSearchChrome {
	static RemoteWebDriver driver;
	
	@BeforeClass
	public void setUp() throws MalformedURLException{
		System.out.println("Running test in Docker Container << Chrome >>");
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setPlatform(Platform.LINUX);
		cap.setVersion("");
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"),cap);	//will use port 4444 to run from the hub to the correct node
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test (description= "Searching in youtube")
	public void googleSearch() throws InterruptedException {
		
		driver.navigate().to("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@type='text' and @id='search']")).sendKeys("Rock music");
		driver.findElement(By.xpath("//*[@id='search-icon-legacy']")).click();
		System.out.println("Search in chrome Completed");
		
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}
	
	public static void tearDown() throws Exception {
		if (driver!=null) {
			System.out.println("Completed Test in Docker Container  << Chrome >>");
		}
	}
}

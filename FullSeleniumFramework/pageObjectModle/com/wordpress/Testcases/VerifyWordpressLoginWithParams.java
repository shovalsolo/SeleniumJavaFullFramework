/**
 * @author Solomon
 * Implementing POM design pattern with Testcase class LoginPageWithParams
 * The design pattern is Page Factory because the params are not hard coded they should come from XML or excel  
 */
package com.wordpress.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPageWithParams;

public class VerifyWordpressLoginWithParams {
	
	@Test
	public void VerifyValidLogin() {				//
		
		String projectPath = System.getProperty("user.dir");														// creating a parameter of the path to the chrome driver
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");//the location of the chrome driver
		WebDriver driver = new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		LoginPageWithParams login = new LoginPageWithParams(driver);	//Creating an object of the page class LoginPage and passing the driver
		
		login.typeUsername("admin");
		login.typePassword("demo123");
		login.clickOnLoginButton();
		driver.quit();
	}

}

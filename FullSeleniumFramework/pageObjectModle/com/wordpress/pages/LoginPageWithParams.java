/**
 * @author Solomon
 * Implementing POM design pattern with Testcase class VerifyWordpressLoginWithParams
 * This class will store all locators and methods of login page
 * Parameters should not be hard coded they should come from XML or excel  
 * 
 */
package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPageWithParams {
	
	WebDriver driver;
	
	By username = By.id("user_login");						//
	By password = By.xpath(".//*[@id='user_pass']");		//
	By loginButton = By.name("wp-submit");					//
	
	
	public LoginPageWithParams(WebDriver driver) {					//Constructor that is getting the WebDriver
		this.driver=driver;									//This will initialize the WebDriver
	}
	
	public void typeUsername(String uid) {							//
		driver.findElement(username).sendKeys(uid);
	}
	
	public void typePassword(String pass) {							//
		driver.findElement(password).sendKeys(pass);
	}

	public void clickOnLoginButton() {						//
		driver.findElement(loginButton).click();
	}
	
}

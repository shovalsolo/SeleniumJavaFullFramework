/**
 * @author Solomon
 * Implementing POM design pattern with Testcase class VerifyWordpressLogin
 * This class will store all locators and methods of login page
 * 
 */
package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
	
	WebDriver driver;
	
	By username = By.id("user_login");						//
	By password = By.xpath(".//*[@id='user_pass']");		//
	By loginButton = By.name("wp-submit");					//
	
	
	public LoginPage(WebDriver driver) {					//Constructor that is getting the WebDriver
		this.driver=driver;									//This will initialize the WebDriver
	}
	
	public void typeUsername() {							//
		driver.findElement(username).sendKeys("admin");
	}
	
	public void typePassword() {							//
		driver.findElement(password).sendKeys("demo123");
	}

	public void clickOnLoginButton() {						//
		driver.findElement(loginButton).click();
	}
	
}

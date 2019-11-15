package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	
	public static void main(String[] args) {
		
		googleSearch();
		
	}
	
	public static void googleSearch() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Go to Google
		
		driver.get("https://google.com/");																	// Navigating to URL
		
		//Enter text in search box
		driver.findElement(By.name("q")).sendKeys("Automation test");										// Navigating to URL
		
		//Click on search button
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);											//Clicking on search button
		
		driver.close();
		
		driver.quit();
		
		System.out.println("Test completed Successfully ");
	}

}

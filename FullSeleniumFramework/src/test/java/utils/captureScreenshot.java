package utils;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class captureScreenshot {
	
	public  captureScreenshot() {

	}
	
	public static void getScreenShot(WebDriver driver, String filePath) throws Exception {
		try {
			System.out.println("In getScreenShot method");
			TakesScreenshot ts = (TakesScreenshot)driver;
			System.out.println("Before getScreenShotAs method");
			File source = ts.getScreenshotAs(OutputType.FILE);
			System.out.println("After getScreenShotAs method");
			FileUtils.copyFile(source , new File(filePath));
		} 
		catch (WebDriverException e) {
			e.printStackTrace();
		}
	}
	
	public static String getDateTimeStamp() {
		Date oDate;
		String[] sDatePart;
		String sDateStamp;
		oDate = new Date();
		System.out.println(oDate.toString());
		sDatePart = oDate.toString().split(" ");
		sDateStamp = sDatePart[5] + " _ "+ sDatePart[1] + " _ "+ sDatePart[2] + " _ "+ sDatePart[3];
		sDateStamp = sDateStamp.replace(":", "_");
		System.out.println(sDateStamp);
		
		return sDateStamp;
	}

}

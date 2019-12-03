package UniversalWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class firstTest extends TestBase {
	
	
	
	@Test
	public void test1() throws Exception {
		Driver.Instance.navigate().to(Configuration.url.app_url);
		Thread.sleep(5000);
		Driver.Instance.findElement(By.name("txtUsername")).sendKeys("Admin");
		Thread.sleep(2000);
		Driver.Instance.findElement(By.name("txtPassword")).sendKeys("admin123");
		Thread.sleep(2000);
		Driver.Instance.findElement(By.xpath("//*[@id=\"btnLogin\"]")).sendKeys(Keys.RETURN);
		Thread.sleep(5000);
	}
	

}

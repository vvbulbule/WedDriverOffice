import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BeforeMethodAfterMethod {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void launch(){
		driver = new FirefoxDriver();
	}
	
	@Test(priority=2)
	public void verifyTitle1(){
		driver.get("http://www.gcreddy.com/2015/06/selenium-videos.html");
		Assert.assertEquals("Register", "Register");
	}
	
	@Test(priority=1)
	public void verifyTitle2(){
		driver.get("https://www.google.co.in/");
		Assert.assertEquals("Google", "Google");
	}
	
	@AfterMethod
	public void closeBrowser(){
		driver.close();
	}

}

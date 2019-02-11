import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class BeforeClassAfterClass {
	
	public WebDriver driver;
	
	@BeforeClass
	public void launchBrowser(){
	driver = new FirefoxDriver();    
	}

	@Test 
	public void verifyPageTitle1(){
	driver.get("https://www.google.com");
	Assert.assertEquals("Google", driver.getTitle());
	}

	@Test
	public void verifyPageTitle2(){
	driver.get("http://www.gcreddy.com/2015/06/selenium-videos.html");
	Assert.assertEquals("Register", "Register");
	}
	
	@AfterClass
	public void closeBrowser(){
	driver.close();
	}
	}


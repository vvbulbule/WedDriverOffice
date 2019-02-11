import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AssertTestNG {
	
	public WebDriver driver;
	@Test (priority=1)
	public void launchBrowser(){
	driver = new FirefoxDriver();    
	}

	@Test (priority=2)
	public void verifyPageTitle1(){
	driver.get("https://www.google.com");
	Assert.assertEquals("Google", driver.getTitle());
	driver.get("http://www.gcreddy.com/2015/06/selenium-videos.html");
	}

	@Test(priority=3)
	public void verifyPageTitle2(){
	//driver.get("https://www.quora.com/#");
	Assert.assertEquals("Quora", "Quora");
	}
	@Test (priority=4)
	public void closeBrowser(){
	driver.close();
	}

}

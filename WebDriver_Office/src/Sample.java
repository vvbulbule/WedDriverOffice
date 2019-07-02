//import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sample{
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
driver.get("https://www.google.co.in/imghp?hl=en&ei=EShNWeG_HcO-0gS7obeABw&ved=0EKouCAIoAQ");
Assert.assertEquals("Google Images", driver.getTitle());
}
@AfterClass
public void closeBrowser(){
driver.close();
}
}
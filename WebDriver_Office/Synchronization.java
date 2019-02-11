import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//WebDriver driver= new FirefoxDriver();
		
		/*driver.get("http://www.gcreddy.com/2016/02/writing-selenium-webdriver-test-cases_26.html");
		Thread.sleep(9000);
		driver.findElement(By.xpath(".//*[@id='at4-share']/a[5]/span[2]")).click();*/
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");

	}

}

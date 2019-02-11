import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DynamicXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver", "E:/Education/SEED/Selenium/Selenium Setup 64 bit OS/Browser Drivers/chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/?affid=kamnatsgm&affExtParam1=shp1");
		

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("sdv");;;
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		
		/*Actions action=new Actions(driver);
		WebElement drop= (driver.findElement(By.xpath("//input[@name='token']")));
		
		action.moveToElement(drop).build().perform();
		*/
		
		//drop.selectByVisibleText("User Guide");
		

	}

}

//import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class demo2 {
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://infoview-bop.bms.com/BOE/BI");
		driver.switchTo().frame("servletBridgeIframe");
		//driver.findElement(By.xpath("html/body/div[1]/form/div/div[3]/input")).click();
		//login page
		Select dropdown= new Select (driver.findElement(By.id("_id0:logon:AUTH_TYPE")));
		dropdown.selectByIndex(1);
		driver.findElement(By.xpath("html/body/div[1]/form/div/div[2]/div[4]/div[2]/input")).sendKeys("kamerkas");
		driver.findElement(By.xpath("html/body/div[1]/form/div/div[2]/div[5]/div[2]/input")).sendKeys("rd1234rd");
		driver.findElement(By.xpath("html/body/div[1]/form/div/div[3]/input")).click();
		Thread.sleep(100000);
		driver.switchTo().frame(2);
		//driver.findElement(By.id("id_34")).click();;
		driver.findElement(By.partialLinkText("Item_Availability")).click();
		Thread.sleep(80000);
	
		//driver.switchTo().frame("BGIFramePool_0");
		String a=driver.getPageSource();
		System.out.println(a);
		
	}

}
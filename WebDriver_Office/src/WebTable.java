import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "/home/vbulbule/Selenium 3.14/chromedriver");
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://randmcnally.jira.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("akshay.nangude@leapscale.com");
		driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("akshay3330");
		driver.findElement(By.xpath("//button[@id='login-submit']//span[@class='css-t5emrf']")).click();
		Thread.sleep(9000);
		WebDriverWait wait = new WebDriverWait(driver, 15000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[@id='gadget-21323-chrome']//span[@class='aui-icon aui-icon-small aui-iconfont-more'][contains(text(),\"getText('more')\")]")))
				.click();
		Thread.sleep(6000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//ul[@class='aui-dropdown standard aui-dropdown-right']//a[@class='item-link aui-icon maximize'][contains(text(),'Maximize')]")))
				.click();
		Thread.sleep(6000);
		
		driver.switchTo().frame("gadget-21323");
		Thread.sleep(6000);
		System.out.println(driver.findElement(By.xpath("//tr[1]//td[2]")).getText());///
		System.out.println(driver.findElement(By.xpath("//tr[31]//td[4]")).getText());
		
		

	}

}

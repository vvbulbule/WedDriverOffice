//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ElementHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://demo.automationtesting.in/Index.html");
		/*driver.navigate().to("http://www.gcreddy.com/2016/02/handling-elements-in-selenium.html");
		driver.navigate().back();
		driver.navigate().forward();
		driver.quit();*/
		
		/*driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement element= driver.findElement(By.xpath(".//*[@id='OKTab']/button"));
		element.click();
		Alert alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();*/
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='btn1']")).isEnabled());
		//driver.findElement(By.xpath(".//*[@id='btn1']")).click();
		//System.out.println(driver.findElement(By.xpath(".//*[@id='btn1']")).isEnabled());
		System.out.println(driver.findElement(By.xpath(".//*[@id='btn1']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath(".//*[@id='btn1']")).isSelected());
		System.out.println(driver.findElement(By.xpath(".//*[@id='btn1']")).getAttribute("type"));
		System.out.println(driver.findElement(By.xpath(".//*[@id='btn1']")).getAttribute("name"));		
		System.out.println(driver.findElement(By.xpath(".//*[@id='btn1']")).getAttribute("title"));
	}

}

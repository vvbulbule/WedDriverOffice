import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Reliability_Edit_Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("http://reliabilitytest.azurewebsites.net/NewLogin.aspx");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_TextBoxEmailId")).sendKeys("robert.bishop@bms.com");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_TextBoxPassword")).sendKeys("12345");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_ButtonLogin")).click();
		
		driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_setTab01']/a")).click();

	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Reliabilty_Title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://reliabilitytest.azurewebsites.net/NewLogin.aspx");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_TextBoxEmailId")).sendKeys("robert.bishop@bms.com");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_TextBoxPassword")).sendKeys("12345");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_ButtonLogin")).click();
		
		String message= driver.findElement(By.xpath(".//*[@id='sectionA']/div/div[2]/h2")).getText();
		
		System.out.println(message);
		
		if (message.equals("Company Admin")){
			System.out.println("data matching");
		}
		else{
			System.out.println("data Not matching");
		}

	}

}

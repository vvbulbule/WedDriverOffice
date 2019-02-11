

//import java.util.concurrent.TimeUnit;
//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Test22 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
       
        driver.navigate().to("http://reliabilitytest.azurewebsites.net/NewLogin.aspx");
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_TextBoxEmailId")).sendKeys("robert.bishop@bms.com");
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_TextBoxPassword")).sendKeys("12345");     
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_ButtonLogin")).click();
        driver.findElement(By.id("ctl00_LinkButtonCompanyManagement")).click();
        driver.findElement(By.id("ButtonEdit")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_TextBoxCompanyName")).clear();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_TextBoxCompanyName")).sendKeys("abc");
        
        new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_DropDownListCompanyCountry"))).selectByVisibleText("India");
        		//.selectByVisibleText("India"));
        //driver.close();
       
	}
}
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ReliabilityLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://reliabilitytest.azurewebsites.net/NewLogin.aspx");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_TextBoxEmailId")).sendKeys("robert.bishop@bms.com");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_TextBoxPassword")).sendKeys("123745");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_ButtonLogin")).click();
		
		String url=driver.getCurrentUrl();
		if(url.equals("http://reliabilitytest.azurewebsites.net/CAdmin/CompanySites.aspx?companyId=mELirpUhRYksFj7k8%2fXBcQ%3d%3d&companyname=i9tNJn7f%2fSKSR%2fXDWwKE22wAcPPJkFBb%2fjLEZGf1%2fxoQiQXc9D2Tt4yXPOcgAhll&siteActive=d62L4tZRqRXRbQYrflRApsMx4ErECeM%2fZeOyJ0mD%2btk%3d")){
			System.out.println("Login Successfull");
		}
		else{
			System.out.println("Login Not Successful");
		}
		driver.close();
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class RegistrationForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/");
		driver.findElement(By.linkText("create an account")).click();
		driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Vikrant");
		driver.findElement(By.name("lastname")).sendKeys("Bulbule");
		driver.findElement(By.name("dob")).sendKeys("05/21/2001");
		driver.findElement(By.name("email_address")).sendKeys("vvbulbu@gmail.com");
		driver.findElement(By.name("street_address")).sendKeys("Baner");
		driver.findElement(By.name("postcode")).sendKeys("431604");
		driver.findElement(By.name("city")).sendKeys("Nanded");
		driver.findElement(By.name("state")).sendKeys("Maharashtra");
		
		Select Dropdown= new Select(driver.findElement(By.name("country")));
		Dropdown.selectByVisibleText("India");
		
		driver.findElement(By.name("telephone")).sendKeys("44556414");
		driver.findElement(By.name("confirmation")).sendKeys("vvbulbul");
		driver.findElement(By.name("password")).sendKeys("vvbulbul");
		driver.findElement(By.id("tdb4")).click();
		
		String Message=driver.findElement(By.xpath(".//*[@id='bodyContent']/h1")).getText();
		//System.out.println(Message);
		
		if(Message.equals("Your Account Has Been Created!")){
			System.out.println("Registration Successful");
		}
		else{
			System.out.println("Registration Not Successful");
		}
		
		
	}

}

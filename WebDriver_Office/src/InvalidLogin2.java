import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class InvalidLogin2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.className("ui-button-text")).click();
		
		String url= driver.getCurrentUrl();
		if(url.equals("http://www.gcrit.com/build3/admin/login.php")){
		String ErrorMessage= driver.findElement(By.className("messageStackError")).getText();
		
		if(ErrorMessage.contains("Error: Invalid administrator login attempt")){
			System.out.println("Invalid UserName/ Pass - passed");
		}}
		else{
			System.out.println("valid UserName/ Pass - Failed");
		}

	}

}

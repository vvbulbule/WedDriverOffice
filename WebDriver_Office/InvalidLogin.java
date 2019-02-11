import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class InvalidLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		
		driver.findElement(By.name("username")).sendKeys("admina");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.className("ui-button-text")).click();
		
		String url= driver.getCurrentUrl();
		if(url.equals("http://www.gcrit.com/build3/admin/index.php")){
			System.out.println("Successful pass");
		}
		else{
			System.out.println("Not success failed");
		}
		driver.close();

	}

}

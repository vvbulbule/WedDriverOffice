import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/");
		driver.findElement(By.linkText("login")).click();
		driver.findElement(By.name("email_address")).sendKeys("vvbulbu@gmail.com");
		driver.findElement(By.name("password")).sendKeys("vvbulbule");
		driver.findElement(By.id("tdb5")).click();
		
		String Url=driver.getCurrentUrl();
		if(Url.equals("http://www.gcrit.com/build3/index.php")){
			System.out.println("Login successful");
		}
		else{
			System.out.println("Login Unsuccessful");
		}
		
		

	}

}

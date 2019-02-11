import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/admin/login.php?osCAdminID=ugva04umi492n1l7qhb54kiud3");
		
		/*boolean result=driver.findElement(By.id("tdb1")).isEnabled();
		System.out.println(result);
		
		if(driver.findElement(By.id("tdb1")).isEnabled()){
			System.out.println("Button is enabled");
		}*/
		WebElement user=driver.findElement(By.name("username"));
		WebElement pass= driver.findElement(By.name("password"));
		user.sendKeys("admin@123");
		System.out.println(user.getAttribute("value"));;
		
		/*driver.findElement(By.id("tdb1")).click();
		
	
		
		String Url= driver.getCurrentUrl();
		
		System.out.println(Url);
		
		driver.navigate().to("https://www.irctc.co.in/eticketing/loginHome.jsf");
		Url= driver.getCurrentUrl();
		System.out.println(Url);
		
		driver.navigate().back();
		Url= driver.getCurrentUrl();
		System.out.println(Url);
		
		/*if(Url.contains("http://www.gcrit.com/build3/admin/index.php")){
			System.out.println("Login Successful");
		}*/
		
		
		
		//driver.close();
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Methods {

	public static WebDriver driver;
	
	//Launch Browser
	public void launchBrowser(){
	
		driver= new FirefoxDriver();
	}
	//Admin Login without parameters
	public void adminLogin(){
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.className("ui-button-text")).click();
	}
	//Admin Login with parameters
	public void adminLogin(String username,String password){
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.className("ui-button-text")).click();
	}
	//close Browser
	public void closeBrowser(){
		if(! driver.toString().contains("null")){
			driver.close();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods obj= new Methods();
		obj.launchBrowser();
		obj.adminLogin();
		obj.closeBrowser();
		obj.launchBrowser();
		obj.adminLogin("admin","admin@123");
		obj.closeBrowser();
	}

}

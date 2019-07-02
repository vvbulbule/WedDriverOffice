import org.openqa.selenium.NoSuchElementException;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Captcha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		driver.findElement(By.name("j_username")).sendKeys("vvbulbule");
		driver.findElement(By.name("j_password")).sendKeys("vvbulbul");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Captcha");
		String Captcha= scan.nextLine();
		System.out.println(scan);
		driver.findElement(By.name("j_captcha")).sendKeys(Captcha);
		driver.findElement(By.name("submit")).click();
		
		try{
			boolean result= driver.findElement(By.xpath(".//*[@id='topnav']/li[8]/ul/li[5]/a/span")).isDisplayed();
			if(result==true){
				System.out.println("Login successful");
			}
		}
		catch(NoSuchElementException e){
			System.out.println("Unsuccesssful");
		}

}}

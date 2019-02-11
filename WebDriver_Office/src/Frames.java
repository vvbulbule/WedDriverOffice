import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://192.168.0.1/TDXXMHSCODIUCTFB/userRpm/Index.htm");
		
		driver.findElement(By.xpath(".//*[@id='userName']")).sendKeys("admin");
		driver.findElement(By.xpath(".//*[@id='pcPassword']")).sendKeys("admin");
		driver.findElement(By.id("loginBtn")).click();
		
		driver.switchTo().frame("bottomLeftFrame");
	
		driver.findElement(By.xpath(".//*[@id='a58']")).click();

	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ImageButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver(); 
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		driver.findElement(By.xpath(".//*[@id='hplogo']")).sendKeys("ghvhd");
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='hplogo']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath(".//*[@id='hplogo']")).getAttribute("title"));
		
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.findElement(By.name("login")).click();
		System.out.println(driver.findElement(By.name("login")).isDisplayed());
		System.out.println(driver.findElement(By.name("login")).isEnabled());

	}

}

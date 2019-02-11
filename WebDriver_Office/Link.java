import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("Hotels")).click();
		driver.findElement(By.partialLinkText("els")).click();
		System.out.println(driver.findElement(By.partialLinkText("els")).isDisplayed());
		System.out.println(driver.findElement(By.partialLinkText("els")).isSelected());
		System.out.println(driver.findElement(By.partialLinkText("els")).isEnabled());
		System.out.println(driver.findElement(By.partialLinkText("els")).getText());
		
		driver.close();

	}

}

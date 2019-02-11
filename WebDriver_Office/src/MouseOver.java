import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		
		Actions action =new Actions(driver);
		
		WebElement menu= driver.findElement(By.xpath(".//*[@id='post-body-4229879368008023176']/div[1]/div[2]/button"));
		
		action.moveToElement(menu).build().perform();
		
		driver.findElement(By.xpath(".//*[@id='post-body-4229879368008023176']/div[1]/div[2]/div/a[2]")).click();

	}

}

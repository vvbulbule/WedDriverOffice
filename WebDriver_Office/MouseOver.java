import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		Actions Builder= new Actions(driver);
		WebElement menu= driver.findElement(By.xpath(".//*[@id='header']/nav/div/div[2]/ul/li[7]/a"));
		Builder.moveToElement(menu).build().perform();
		//driver.findElement(By.xpath(".//*[@id='header']/nav/div/div[2]/ul/li[7]/ul/li[2]/a")).click();
	}

}

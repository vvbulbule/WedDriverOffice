import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://demo.automationtesting.in/Charts.html");
		Actions action = new Actions(driver);
		WebElement ele= driver.findElement(By.xpath(".//*[@id='header']/div/div/div/div[2]/h1"));
		action.doubleClick(ele).build().perform();
	}

}

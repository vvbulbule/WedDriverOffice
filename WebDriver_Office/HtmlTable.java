import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class HtmlTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.carmax.com/");
		//System.out.println(driver.findElement(By.xpath(".//*[@id='1494521654034-3-uiGrid-0006-cell']/div")).getText());
		Actions builder= new Actions (driver) ;
		WebElement element= driver.findElement(By.linkText("Sell Your Car")) ;
		builder.moveToElement(element).build().perform();
		driver.findElement(By.xpath("html/body/div[1]/ul/li[1]/a")).click();
		driver.close();
		

	}

}

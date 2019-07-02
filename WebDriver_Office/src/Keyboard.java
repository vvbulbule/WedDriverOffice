import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Keyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver d= new FirefoxDriver();
		d.get("https://www.google.co.in/?gws_rd=ssl");
		
		WebElement g= d.findElement(By.linkText("Gmail"));
		
		Actions builder = new Actions(d);
		builder.contextClick(g).sendKeys("P").build().perform();

	}

}

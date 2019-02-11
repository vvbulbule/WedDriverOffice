
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Dragdrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d= new FirefoxDriver();
		d.get("https://jqueryui.com/droppable/");
		d.manage().window().maximize();
		//java.util.List<WebElement> frames=d.findElements(By.tagName("iframe"));
		//System.out.println(frames.size());
		Actions act=new Actions(d);
		d.switchTo().frame(0);
		WebElement darg=d.findElement(By.id("draggable"));
		WebElement drop=d.findElement(By.id("droppable"));
		
		act.dragAndDrop(darg, drop).build().perform();
		//act.clickAndHold(darg).release(drop).build().perform();
		

	}

}

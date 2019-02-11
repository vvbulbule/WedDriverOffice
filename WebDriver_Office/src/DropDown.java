import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		Select dropdown= new Select (driver.findElement(By.id("continents")));
		//dropdown.selectByIndex(2);
		//dropdown.selectByVisibleText("Europe");
		List <WebElement> a=dropdown.getOptions();
		int itemCount=a.size();
		System.out.println(itemCount);
		
		for( int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i).getText());
		}
	}

}

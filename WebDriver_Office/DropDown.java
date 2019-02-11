import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		Select dropdown= new Select (driver.findElement(By.id("Skills")));
		dropdown.selectByIndex(2);
		//dropdown.selectByVisibleText("C");
		
		List <WebElement> e=dropdown.getOptions();
		int ItemCount=e.size();
		System.out.println(ItemCount);

	}

}

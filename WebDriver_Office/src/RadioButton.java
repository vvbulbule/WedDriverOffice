import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/create_account.php");
		
		WebElement radio= driver.findElement(By.name("gender"));
		System.out.println(radio.isSelected());
		radio.click();
		System.out.println(radio.isSelected());
		

	}

}


 
import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class getalllinks {
 
	public static void main(String[] args) {
 
		WebDriver driver = new FirefoxDriver();
 
		driver.get("http://google.com/");
 
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
 
		System.out.println(links.size());
 
		try {for (int i = 1; i<=50; i=i+1)
 
		
 
			System.out.println(links.get(i).getText());
 
		} 
		catch(ArrayIndexOutOfBoundsException e2)
		{
			System.out.println("Array Out of size");
		}
		
 
	}
 
}
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/index.php");
		
		String text= driver.findElement(By.xpath(".//*[@id='bodyContent']/div/div[1]")).getText();
		System.out.println(text);

	}

}

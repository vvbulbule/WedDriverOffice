import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class ElementLocators {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='section']/div/h2")).isDisplayed());
		
		/*String a= driver.findElement(By.xpath(".//*[@id='section']/div/h2")).getText();
		System.out.println(a);
		driver.close();*/
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
	}

}

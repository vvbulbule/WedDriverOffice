import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class InternalOrExternalLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
		driver.findElement(By.linkText("Create account")).click();
		String url= driver.getCurrentUrl();
		if(url.contains("https://en.wikipedia.org/")){
			System.out.println("Internal same app");
		}
		else{
			System.out.println("External other app");
		}
		driver.navigate().back();
		driver.findElement(By.linkText("www.seleniumhq.org")).click();
		url=driver.getCurrentUrl();
		if(! url.equals("https://en.wikipedia.org/")){
			System.out.println("External other app");
		}
		else{
			System.out.println("Internal same app");
		}
		

	}

}

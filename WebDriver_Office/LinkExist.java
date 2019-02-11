import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LinkExist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com");
		
		try{
		//boolean exists=driver.findElement(By.partialLinkText("Gmail")).isDisplayed();
		if(driver.findElement(By.partialLinkText("Gmail")).isDisplayed()){
			System.out.println("Gmail Present");
		}}
		catch(NoSuchElementException e){
			System.out.println("Gmail not Present");
		}
		
driver.close();
	}

}

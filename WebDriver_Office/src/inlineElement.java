import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class inlineElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=w5dMWs63OOWR8Qf31avADg");
		
		driver.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='gb78']/span[1]")).click();
		
		
		

	}

}

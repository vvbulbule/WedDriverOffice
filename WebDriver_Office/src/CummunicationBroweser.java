import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.WebDriverException;


public class CummunicationBroweser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*WebDriver FirefoxDriver1= new FirefoxDriver();
		FirefoxDriver1.get("https://www.google.co.in/");
		FirefoxDriver1.findElement(By.partialLinkText("Gmail")).click();
		
		System.setProperty("webdriver.chrome.driver", "D:/Selenium/MY Selenium Setup/chromedriver.exe");
		WebDriver ChromeDriver2= new org.openqa.selenium.chrome.ChromeDriver();
		ChromeDriver2.get("http://www.gcreddy.com/2016/02/");*/
		
		System.setProperty("webdriver.opera.driver", "C:/Users/VBulbule.AX/Desktop/operadriver_win32.exe");
		WebDriver IEDriver= new OperaDriver();
		IEDriver.get("http://www.gcreddy.com/2016/02/");

	}

}

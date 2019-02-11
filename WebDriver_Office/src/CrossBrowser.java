import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class CrossBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:/Education/SEED/Selenium/Selenium Setup 64 bit OS/Browser Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		
		System.setProperty("webdriver.ie.driver", "E:/Education/SEED/Selenium/Selenium Setup 64 bit OS/Browser Drivers/IEDriverServer.exe");
		 driver= new InternetExplorerDriver();
		driver.get("http://www.gcreddy.com/");

	}

}

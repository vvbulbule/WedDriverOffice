import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class screenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "E:/Education/SEED/Selenium/Selenium Setup 64 bit OS/Browser Drivers/chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		WebDriver driver= new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//FileUtils.copyFile(src, new File ("C:/Users/Vikrant/Desktop/a.png"));

	}

}

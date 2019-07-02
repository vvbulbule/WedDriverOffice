import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Screen {
	
	public static void main(String[] args) throws IOException {
		//System.setProperty("webdriver.gecko.driver", "D:/Selenium/MY Selenium Setup/geckodriver-v0.11.1-win64 (1)/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();



		// Pass the url
		driver.get("http://www.gcreddy.com/");

		// Take screenshot and store as a file format
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		// now copy the screenshot to desired location using copyFile //method
		//FileUtils.copyFile(src, new File("C:/selenium/error3.png"));

	}
}
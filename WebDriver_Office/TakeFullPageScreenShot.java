import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
 
import javax.imageio.ImageIO;
import java.io.File;
 
public class TakeFullPageScreenShot
{
   public static void main(String args[]) throws Exception
   {
       //System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
       WebDriver driver = new FirefoxDriver();
 
       driver.get("http://www.gcreddy.com/");
       //Thread.sleep(2000);
 
       Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
       ImageIO.write(screenshot.getImage(),"PNG",new File("C:/selenium/error.png"));
   }
}
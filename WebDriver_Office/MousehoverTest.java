import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MousehoverTest {
 @Test

 public void test()

 {

 WebDriver driver=new FirefoxDriver();



 driver.manage().window().maximize();

 driver.get("http://www.learncertification.com/");

 WebElement parent=driver.findElement(By.id("butt"));

   Actions builder = new Actions(driver);

   Action mouseOver = builder

                .moveToElement(parent)

                .build();

 mouseOver.perform();

}}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class MouseEvent 
{
 public static void main(String[] args) 
 {
  /* declaration and instantiation of objects/variables */
  WebDriver driver = new FirefoxDriver();
  String baseWebUrl = "http://www.flipkart.com/";
  driver.get(baseWebUrl);
  /* get the actual value of the title */
  WebElement headerelement = driver.findElement(By.linkText("ELECTRONICS"));
  Actions builder = new Actions(driver);
  Action mouseoverevent = builder.moveToElement(headerelement).build();
  mouseoverevent.perform();
  /* closing Firefox Browser and System */
  driver.close();
  System.exit(0);
 }
}

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class BarGraph {

public WebDriver driver;

@BeforeSuite
public void setUp(){
driver = new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}
/*
@AfterSuite
public void testDown(){
driver.close();;
}
*/
/*@Test
public void testChart1() throws InterruptedException {
driver.get("http://yuilibrary.com/yui/docs/charts/charts-column.html");

List<WebElement> elements = driver.findElements(By.xpath("//*[contains(@class,'yui3-svgRect yui3-seriesmarker')]"));
WebElement toolTip = driver.findElement(By.xpath("//div[contains(@class,'yui3-chart-tooltip')]"));
System.out.println("Specify Chart Type Data");
for (WebElement el:elements)
{
el.click(); 
String chartValue = toolTip.getText();
System.out.println(chartValue);
}
}*/

@Test
public void testChart2(){
driver.get("http://yuilibrary.com/yui/docs/charts/charts-dualaxes.html");
List<WebElement> elements = driver.findElements(By.xpath("//*[contains(@class,'yui3-svgCircle yui3-seriesmarker')]"));
WebElement toolTip = driver.findElement(By.xpath("//div[contains(@class,'yui3-chart-tooltip')]"));
System.out.println("\nDual Axes Chart Data");
for (WebElement el:elements)
{
el.click(); 
String chartValue = toolTip.getText();
System.out.println(chartValue);
}
}}
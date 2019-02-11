import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SamplePie {
 
 WebDriver driver;
 
 @BeforeTest
 public void setup() throws Exception {
  driver = new FirefoxDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  driver.get("https://www.highcharts.com/demo/pie-basic");
 }
 
 @Test
 public void pieChart() throws InterruptedException{
  //Locate pie chart elements based on different colors.
  WebElement VioleteColor = driver.findElement(By.xpath("html/body/div[2]/div/div/div[4]/div[3]/div/div/svg/g[1]/g[1]/path[2]"));
  VioleteColor.click();
  /*WebElement GreenColor = driver.findElement(By.xpath("//*[contains(@class,'yui3-svgSvgPieSlice')][@fill='#295454']"));
  WebElement GreyColor = driver.findElement(By.xpath("//*[contains(@class,'yui3-svgSvgPieSlice')][@fill='#e8cdb7']"));
  WebElement LightVioleteColor = driver.findElement(By.xpath("//*[contains(@class,'yui3-svgSvgPieSlice')][@fill='#996ab2']"));
  WebElement BrownColor = driver.findElement(By.xpath("//*[contains(@class,'yui3-svgSvgPieSlice')][@fill='#a86f41']"));
  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
  
  //locate tooltip pie chart.
  WebElement ToolTip = driver.findElement(By.xpath("//div[contains(@id,'_tooltip')]"));

  //Click on pie chart parts and get tooltip values.
  System.out.println("-X-X-X-X-X-X-X-X- Violete Part -X-X-X-X-X-X-X-X-");
  VioleteColor.click();  
  System.out.println(ToolTip.getText());
  System.out.println();  
  
  /*System.out.println("-X-X-X-X-X-X-X-X- Grey Part -X-X-X-X-X-X-X-X-");
  GreyColor.click();
  System.out.println(ToolTip.getText());
  System.out.println();
  
  System.out.println("-X-X-X-X-X-X-X-X- Light Violete Part -X-X-X-X-X-X-X-X-");
  LightVioleteColor.click();
  System.out.println(ToolTip.getText());
  System.out.println();
  
  System.out.println("-X-X-X-X-X-X-X-X- Green Part -X-X-X-X-X-X-X-X-");
  GreenColor.click();
  System.out.println(ToolTip.getText());
  System.out.println();
  
  System.out.println("-X-X-X-X-X-X-X-X- Brown Part -X-X-X-X-X-X-X-X-");
  BrownColor.click();
  System.out.println(ToolTip.getText());  */
 }
}
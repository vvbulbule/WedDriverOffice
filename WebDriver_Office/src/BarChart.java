import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
 
public class BarChart {
  
    public WebDriver driver;
  
    @BeforeSuite
    public void setUp(){
         driver = new FirefoxDriver();
         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
 
    @AfterSuite
    public void testDown(){
        driver.quit();
    }
  
    @Test
    public void testChart1() throws InterruptedException {
   
        driver.get("http://192.168.2.219/ibmcognos/cgi-bin/cognosisapi.dll?b_action=cognosViewer&ui.action=run&ui.object=%2fcontent%2ffolder[%40name%3d%27Reports%27]%2freport[%40name%3d%27WO%20Labor%20Hours%20Summary%27]&ui.name=WO%20Labor%20Hours%20Summary&run.outputFormat=&run.prompt=true&ui.backURL=%2fibmcognos%2fcgi-bin%2fcognosisapi.dll%3fb_action%3dxts.run%26m%3dportal%2fcc.xts%26m_folder%3diB9C14496631E4777B8E4CF3C585B4C3E%26m_folder2%3dm-i425842DF9A0040FB9425F1BA1876F751");
   
        //read chart value
        List<WebElement> elements = driver.findElements(By.xpath("//*[contains(@class,'chart_area')]"));
        WebElement toolTip = driver.findElement(By.xpath("//div[contains(@class,'c_NS_ ch')]"));
        System.out.println("Specify Chart Type Data");
        for (WebElement el:  elements)
        {
             el.click(); 
             String chartValue = toolTip.getText();
             System.out.println(chartValue);
        }  
    }
  
   
}
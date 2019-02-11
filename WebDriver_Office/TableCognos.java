
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class TableCognos { 
 
 WebDriver driver = new FirefoxDriver();
 @BeforeTest
    public void setup() throws Exception { 
         driver.manage().window().maximize();
         driver.get("http://192.168.2.219/ibmcognos/cgi-bin/cognosisapi.dll?b_action=cognosViewer&ui.action=run&ui.object=%2fcontent%2ffolder[%40name%3d%27Reports%27]%2freport[%40name%3d%27WO%20Labor%20Hours%20Summary%27]&ui.name=WO%20Labor%20Hours%20Summary&run.outputFormat=&run.prompt=true&ui.backURL=%2fibmcognos%2fcgi-bin%2fcognosisapi.dll%3fb_action%3dxts.run%26m%3dportal%2fcc.xts%26m_folder%3diB9C14496631E4777B8E4CF3C585B4C3E%26m_folder2%3dm-i425842DF9A0040FB9425F1BA1876F751"); 
         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
 } 
 
  /*@AfterTest
 public void tearDown() throws Exception { 
   driver.quit();
     } */
  
 public void print_data(){
 // Get the values of the cell
	WebElement ele=driver.findElement(By.xpath(".//*[@id='rt_NS_']/tbody/tr[2]/td/table[2]/tbody/tr[2]/td/table/tbody/tr[2]/td[2]"));
	System.out.println("Values of the cell is: "+ele.getText());
 //Get number of rows In table.
 List<WebElement> Row_count = driver.findElements(By.xpath(".//*[@id='rt_NS_']/tbody/tr[2]/td/table[2]/tbody/tr[2]/td/table/tbody/tr"));
 System.out.println("Number Of Rows = "+Row_count.size());
 
 //Get number of columns In table.
 List<WebElement> Col_count = driver.findElements(By.xpath(".//*[@id='rt_NS_']/tbody/tr[2]/td/table[2]/tbody/tr[2]/td/table/tbody/tr[1]/td"));
 System.out.println("Number Of Columns = "+Col_count.size());
 
for(WebElement data:driver.findElements(By.xpath(".//*[@id='rt_NS_']/tbody/tr[2]/td/table[2]/tbody/tr[2]/td/table/tbody/tr"))){
	System.out.println(data.getText());
} 
driver.close();
 }
}


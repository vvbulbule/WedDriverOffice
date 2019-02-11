import java.io.File;
import java.io.IOException;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;

public class Local
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
       
        driver.get("http://192.168.2.219/ibmcognos/cgi-bin/cognosisapi.dll?b_action=cognosViewer&ui.action=run&ui.object=%2fcontent%2ffolder[%40name%3d%27Reports%27]%2freport[%40name%3d%27WO%20Labor%20Hours%20Summary%27]&ui.name=WO%20Labor%20Hours%20Summary&run.outputFormat=&run.prompt=true&ui.backURL=%2fibmcognos%2fcgi-bin%2fcognosisapi.dll%3fb_action%3dxts.run%26m%3dportal%2fcc.xts%26m_folder%3diB9C14496631E4777B8E4CF3C585B4C3E%26m_folder2%3dm-i425842DF9A0040FB9425F1BA1876F751");
        Thread.sleep(70000);
        
        new Select(driver.findElement(By.xpath("html/body/form[1]/table/tbody/tr[3]/td/div/div[1]/table/tbody/tr[2]/td/table[1]/tbody/tr/td[1]/div/table/tbody/tr/td[2]/div/select"))).selectByIndex(2);
        Thread.sleep(80000);
        new Select (driver.findElement(By.xpath("html/body/form[1]/table/tbody/tr[3]/td/div/div[1]/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/div/table/tbody/tr/td[2]/div/select"))).selectByIndex(1);
        new Select (driver.findElement(By.xpath("html/body/form[1]/table/tbody/tr[3]/td/div/div[1]/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/div/table/tbody/tr/td[2]/div/select"))).selectByIndex(2);
        String val=driver.findElement(By.xpath("html/body/form[1]/table/tbody/tr[3]/td/div/div[1]/table/tbody/tr[2]/td/table[2]/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/span")).getText();
        System.out.println(val);
        
       
        System.out.println(driver.findElement(By.xpath("html/body/form[1]/table/tbody/tr[3]/td/div/div[1]/table/tbody/tr[2]/td/table[2]/tbody/tr[1]/td/map/area[6]")).getAttribute("title"));
        
        
	}
}
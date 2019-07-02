import org.openqa.selenium.By;
import org.openqa.selenium.Keys; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.firefox.FirefoxDriver; 

public class KeyboardOperations { 
         public static void main(String[] args) { 
                WebDriver driver = new FirefoxDriver(); 
                driver.navigate().to("http://www.google.co.in"); // Actual loading of website 
               System.out.println("Make entries into Google Search using keyboard actions"); 
               WebElement searchInput = driver.findElement(By.className("gsfi")); 
               String allKeys = ""+ Keys.NUMPAD1 + Keys.NUMPAD9 + Keys.NUMPAD9 + Keys.NUMPAD9; // 1 + 9 + 9 + 9 
               allKeys = allKeys + Keys.ENTER; // now add the ENTER key. We could also have done it above 
               searchInput.sendKeys(allKeys); // send the key presses into the text box 
               /*searchInput.sendKeys("999");
               driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();*/
        } 
}
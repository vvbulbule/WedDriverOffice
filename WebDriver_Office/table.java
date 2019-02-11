
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class table { 
	

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://webdatacommons.org/webtables/"); 
		//Print Values of the cell 
		WebElement ele=driver.findElement(By.xpath(".//*[@id='toccontent']/table[1]/tbody/tr[3]/td[1]"));
		System.out.println("Values of the cell is: "+ele.getText());
		//Get number of rows In table.
		List<WebElement> Row_count = driver.findElements(By.xpath(".//*[@id='toccontent']/table[1]/tbody/tr"));
		System.out.println("Number Of Rows = "+Row_count.size());

		//Get number of columns In table.
		List<WebElement> Col_count = driver.findElements(By.xpath(".//*[@id='toccontent']/table[1]/tbody/tr[1]/th"));
		System.out.println("Number Of Columns = "+Col_count.size());

		for(WebElement data:driver.findElements(By.xpath(".//*[@id='toccontent']/table[1]/tbody/tr"))){
			System.out.println(data.getText()+"");
	}
		driver.close();
	
	
}
}


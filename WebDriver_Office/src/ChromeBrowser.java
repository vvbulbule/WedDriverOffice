import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;


public class ChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.opera.driver", "D:/Selenium/MY Selenium Setup/operadriver.exe");
		WebDriver driver = new OperaDriver();
		driver.get("https://www.google.co.in/");
		
		String pagetitle= driver.getTitle();
		//System.out.println(pagetitle);
		if(pagetitle.equals("Google")){
			System.out.println("Google launched = passed");
		}
		else{
			System.out.println("Google Launch - Failed");
		}
		
		
		driver.close();
	}

}

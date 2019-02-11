import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Browser {

	public static WebDriver driver;
	public static int browser;
	public static String BrowserName;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(browser=1;browser<=2;browser++)
		{
			if ( browser==1){
				driver = new FirefoxDriver();
				BrowserName="Mozilla";
				//System.out.println(BrowserName);
			}
			else {
				System.setProperty("webdriver.chrome.driver", "D:/Selenium/MY Selenium Setup/chromedriver.exe");
				driver=new ChromeDriver();
				BrowserName="chrome";
			}
			
			driver.get("https://www.google.co.in/");
			
			String pagetitle= driver.getTitle();
			//System.out.println(pagetitle);
			if(pagetitle.equals("Google")){
				System.out.println(BrowserName+"Google launched = passed");
			}
			else{
				System.out.println(BrowserName+"Google Launch - Failed");
			}
			driver.close();
		
		

	}
	}
}

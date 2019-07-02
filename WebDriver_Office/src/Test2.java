import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test2 
{


public static void main(String[] args) throws Exception 
{

        WebDriver driver = new FirefoxDriver();
        //driver.manage().deleteAllCookies();
        //driver.get("www.google.com");
        driver.navigate().to("http://reliabilitytest.azurewebsites.net/NewLogin.aspx");
}
}

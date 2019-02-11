import org.openqa.selenium.By;


public class TestCases extends Methods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestCases obj4= new TestCases();
		
		obj4.launchBrowser();
		obj4.adminLogin();
		driver.findElement(By.xpath("html/body/table[1]/tbody/tr[2]/td[1]/a[2]")).click();
		
		String url= driver.getCurrentUrl();
		
		if(url.equals("http://www.gcrit.com/build3/")){
			System.out.println("Redirected passed");
		}
		else{
			System.out.println("Redirected Failed");
		}
		obj4.closeBrowser();

//Admin Valid
		
		obj4.launchBrowser();
		obj4.adminLogin("admin", "admin@123");
		
		url= driver.getCurrentUrl();
		if(url.equals("http://www.gcrit.com/build3/admin/index.php")){
			System.out.println("Login valid pass");
		}
		else{
			System.out.println("Login valid Failed");
		}
		obj4.closeBrowser();
//Admin Invalid
		obj4.launchBrowser();
		obj4.adminLogin("admin","admin@12h3");
		
		String Text= driver.findElement(By.xpath("html/body/table[1]/tbody/tr/td")).getText();
		
		if(Text.contains(" Error: Invalid administrator login attempt.")){
			System.out.println("Invalid Inputs passed");
		}
		else{
			System.out.println("Invalid Inputs Failed");
		}
		obj4.closeBrowser();

	}

}

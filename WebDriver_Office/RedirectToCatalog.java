import org.openqa.selenium.By;


public class RedirectToCatalog extends Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RedirectToCatalog obj1= new RedirectToCatalog();
		obj1.launchBrowser();
		obj1.adminLogin();
		driver.findElement(By.xpath("html/body/table[1]/tbody/tr[2]/td[1]/a[2]")).click();
		
		String url= driver.getCurrentUrl();
		
		if(url.equals("http://www.gcrit.com/build3/")){
			System.out.println("Redirected passed");
		}
		else{
			System.out.println("Redirected Failed");
		}

	}

}

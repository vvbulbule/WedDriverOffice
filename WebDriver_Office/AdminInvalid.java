import org.openqa.selenium.By;


public class AdminInvalid extends Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdminInvalid obj3= new AdminInvalid();
		
		obj3.launchBrowser();
		obj3.adminLogin("admin","admin@12h3");
		
		String Text= driver.findElement(By.xpath("html/body/table[1]/tbody/tr/td")).getText();
		
		if(Text.contains(" Error: Invalid administrator login attempt.")){
			System.out.println("Invalid Inputs passed");
		}
		else{
			System.out.println("Invalid Inputs Failed");
		}
		obj3.closeBrowser();

	}

}

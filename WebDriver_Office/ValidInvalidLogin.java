import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ValidInvalidLogin {
	static int i;
	static String username,password,iteration;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		
		for(i=1;i<=2;i++){
		
			if(i==1){
				username="admin";
				password="admin@123";
				iteration="Iteration1";
			}
			
			if(i==2){
				username="admina";
				password="admin@123a";
				iteration="Iteration2";
				
			}
			
			driver.get("http://www.gcrit.com/build3/admin/");
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.className("ui-button-text")).click();
			String url= driver.getCurrentUrl();
			if(url.contains("http://www.gcrit.com/build3/admin/index.php")){
				System.out.println(iteration + ("Input data:")+username+","+password+"success"  );
				driver.findElement(By.linkText("Logoff")).click();
			}
			else if(! url.contains("http://www.gcrit.com/build3/admin/index.php")){
				String ErrorMessage=driver.findElement(By.className("messageStackError")).getText();
				if(ErrorMessage.contains(" Invalid administrator login attempt.")){
					System.out.println(iteration + ("Input data:")+username+","+password+"Invalid success"  );
				}
				
				else{
					System.out.println(iteration+"failed");
				}
			}
			
			
			
		}
		
		
		

	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class radioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		System.out.println(driver.findElement(By.name("radiooptions")).isDisplayed());;
		System.out.println(driver.findElement(By.name("radiooptions")).isEnabled());;
		System.out.println(driver.findElement(By.name("radiooptions")).isSelected());;
		
		driver.findElement(By.name("radiooptions")).click();
		System.out.println(driver.findElement(By.name("radiooptions")).isSelected());;
		driver.close();
		
		
		

	}

}

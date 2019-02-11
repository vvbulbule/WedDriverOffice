import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown3 
{
	private WebDriver d;
	public int i;
	@Test
	public void testUntitled() throws Exception 
	{
		d = new FirefoxDriver();
		d.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(50000);
		

		String[] exp = {"Month","1","2","3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}; 
		int exp_number_of_Element=exp.length;
		
		WebElement dropdown = d.findElement(By.xpath("html/body/section/div/div/div[2]/form/div[11]/div[2]/select"));  
		Select select = new Select(dropdown);  

		List<WebElement> dropdownvalues = select.getOptions(); 
		if (exp_number_of_Element==dropdownvalues.size())System.out.println("Number of element matching with exp & dropDown total element are "+dropdownvalues.size());
		else System.out.println("Number of element not matching with exp & dropDown");
		 	
		if(exp_number_of_Element==dropdownvalues.size()){
			for (int i=0; i<dropdownvalues.size(); i++){
	             Assert.assertEquals(exp[i],dropdownvalues.get(i).getText());
				/*if(exp[i].equals(dropdownvalues.get(i).getText())){System.out.println(exp[i]+" Data match "+dropdownvalues.get(i).getText());}
				else{System.out.println(exp[i]+" Data match not Matched "+dropdownvalues.get(i).getText());}*/
			}
	             
	         System.out.println("Verification Successful"); 
		
		}
	}}


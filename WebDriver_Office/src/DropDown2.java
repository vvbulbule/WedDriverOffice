import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDown2 
{
	private WebDriver d;
	public int i;
	@Test
	public void testUntitled() throws Exception 
	{
		d = new FirefoxDriver();
		d.get("http://192.168.2.219/ibmcognos/cgi-bin/cognosisapi.dll?b_action=cognosViewer&ui.action=run&ui.object=%2fcontent%2ffolder[%40name%3d%27Reports%27]%2freport[%40name%3d%27WO%20Labor%20Hours%20Summary%27]&ui.name=WO%20Labor%20Hours%20Summary&run.outputFormat=&run.prompt=true&ui.backURL=%2fibmcognos%2fcgi-bin%2fcognosisapi.dll%3fb_action%3dxts.run%26m%3dportal%2fcc.xts%26m_folder%3diB9C14496631E4777B8E4CF3C585B4C3E%26m_folder2%3dm-i425842DF9A0040FB9425F1BA1876F751");
		Thread.sleep(50000);
		

		String[] exp = {"ALL","BLCKPL","CNP ROCH", "CONOR", "COR", "CORK", "CWCLOC", "INDCAL", "INDMNT", "JJBADDI", "JJBKK", "JJC", "JJKCJ","JJMULUND", "JJMYPJ", "JRZ", "LEEDS", "LFSS", "MEMPHIS","MEX", "MEXLOC", "MIALAKES", "MTNVIEW", "NORDERST", "PENCOED", "PR", "PURLOC", "RAYNHAM","RMROCH", "SAL", "SAN", "SJJ", "SOMCAL", "SOMMNT", "TORCAL", "TORMNT", "VISTJACK", "WARREN", "WARSAW", "WRNLOC"}; 
		int exp_number_of_Element=exp.length;
		
		WebElement dropdown = d.findElement(By.xpath("html/body/form[1]/table/tbody/tr[3]/td/div/div[1]/table/tbody/tr[2]/td/table[1]/tbody/tr/td[1]/div/table/tbody/tr/td[2]/div/select"));  
		Select select = new Select(dropdown);  

		List<WebElement> dropdownvalues = select.getOptions(); 
		if (exp_number_of_Element==dropdownvalues.size())System.out.println("Number of element matching with exp & dropDown total element are "+dropdownvalues.size());
		else System.out.println("Number of element not matching with exp & dropDown");
		 	
		if(exp_number_of_Element==dropdownvalues.size()){
			for (int i=0; i<dropdownvalues.size(); i++){
	             Assert.assertEquals(exp[i],dropdownvalues.get(i).getText());
				/*if(exp[i].equals(dropdownvalues.get(i).getText())){System.out.println(exp[i]+" Data match "+dropdownvalues.get(i).getText());}
				else{System.out.println(exp[i]+" Data not Matched "+dropdownvalues.get(i).getText());}*/
			}
	             
	         System.out.println("Verification Successful"); 
		
		}
	}}


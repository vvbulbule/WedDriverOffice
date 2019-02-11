import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNgSample {
	
	@Test(priority=1)
	public void TestA(){
		Assert.assertEquals("Gmail", "Gmail");
	}
	@Test(priority=2,enabled=true)	
	public void TestC(){
		Assert.assertEquals("Gmail", "Google");
	}
	
	@Test (priority=3)
	public void TestB(){
		Assert.assertEquals("Yahoo", "yahoo");
	}

}

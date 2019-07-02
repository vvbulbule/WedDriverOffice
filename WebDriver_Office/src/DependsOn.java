import org.testng.annotations.Test;


public class DependsOn {
	
	@Test
	public void login(){
		System.out.println("Login Successful");
	}
	
	@Test(dependsOnMethods={"login"})
	public void search(){
		System.out.println("Search Successful");
	}
	
	@Test(dependsOnMethods={"search"})
	public void advancesearch(){
		System.out.println("Search Advance Successful");
	}
	
	/*@Test(dependsOnMethods={"advancesearch"})
	public void logout(){
		System.out.println("Logout Successful");
	}*/
	

}

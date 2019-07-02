
public class AdminValid extends Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminValid obj2= new AdminValid();
		
		obj2.launchBrowser();
		obj2.adminLogin("admin", "admin@1232");
		
		String url= driver.getCurrentUrl();
		if(url.equals("http://www.gcrit.com/build3/admin/index.php")){
			System.out.println("Login valid pass");
		}
		else{
			System.out.println("Login valid Failed");
		}
		

	}

}


public class EnhancedFor4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double [] languages= new double[4];
		double a=1,b=20;
		
		languages[0]= a+b;
		languages[1]=a/b;
		
		for(double lang:languages){
			System.out.println(lang);
		}  
		

	}

}

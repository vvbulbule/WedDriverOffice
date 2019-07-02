
public class EnhancedFor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] mathoperations = new int[3];
		int a=100,b=200;
		
		mathoperations[0]= a+b;
		mathoperations[1]=a-b;
		
		for(int l: mathoperations){
			System.out.println(l);
		}

	}

}

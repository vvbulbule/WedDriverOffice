
public class ElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=-(-0);
		
		if ((a>=1) && (a<=100)){
			System.out.println("Small Number");
		}
		else if ((a>=100) && (a<=1000)){
			System.out.println("Medium Number");
		}else if ((a>=1000) && (a<=10000)){
			System.out.println("Big Number");
		}else if ((a>=10000)){
			System.out.println("High Number");
		}else {
			System.out.println("Zero or Negative");
		}
			

	}

}

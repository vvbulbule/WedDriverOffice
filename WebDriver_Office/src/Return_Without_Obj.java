

public class Return_Without_Obj {
	
	public static int multiply(int a,int b,int c){
		int result = a*b*c;
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myfinal=multiply(10, 20, 22);
		
		System.out.println(myfinal);
		System.out.println(multiply(10,20,22));

	}

}

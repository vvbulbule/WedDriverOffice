
public class Return_With_Obj {
	
	public int multiply(int a, int b , int c){
		int result=a*b*c;
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Return_With_Obj obj= new Return_With_Obj();
		
		int myresult=obj.multiply(10, 20, 30);
		
		System.out.println(myresult);
		
		System.out.println(obj.multiply(10, 20,10));
		
		

	}

}

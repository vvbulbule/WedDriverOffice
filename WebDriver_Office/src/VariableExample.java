
public class VariableExample {
	
	static int a=100; // Static variable
	static int d=1;
	
	public int mysalry(){
		int a=9475;// local variable
		return a;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=200,c;// instance variable
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		
		VariableExample obj=new VariableExample();
		c= (obj.mysalry());
		System.out.println(c);
		
		for(int i=1;i<=10;i++){
			System.out.println(i);//i is local variable
		}
			

	}

}

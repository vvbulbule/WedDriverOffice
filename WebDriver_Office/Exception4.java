
public class Exception4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10,b=0;
		
		int abc[]= new int[4];
		
		try{
			System.out.println(a/b);
		}
		catch(ArithmeticException e1){
			System.out.println("Divided by Zero Error");
		}
		System.out.println("Selenium");
		try{
			System.out.println(abc[100]);
		}
		catch(ArrayIndexOutOfBoundsException e2)
		{
			System.out.println("Array Out of size");
		}
		System.out.println("QTP");
	}

}

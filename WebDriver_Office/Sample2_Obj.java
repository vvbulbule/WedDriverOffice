
public class Sample2_Obj {
	
	public int add(int a, int b, int c){
		int result=a+b+c;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample2_Obj obj1= new Sample2_Obj();
		
		int Final= obj1.add(1, 25, 30);
		System.out.println(Final);
		
		Sample1_Obj obj2= new Sample1_Obj();
		
		int z=obj2.multiply(10,12,30);
		
		System.out.println(z);
		System.out.println(obj2.multiply(10,12,30));

	}

}

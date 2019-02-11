	
public class MethodOverLoading {
	void add(int a, int b){
		System.out.println(a+b);
	}
	void add(int a, int b,int c){
		System.out.println(a+b+c);
	}
	void add(double a, double b){
		System.out.println(a+b);
	}
	void add(double a, double b,double c){
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverLoading obj= new MethodOverLoading();
		obj.add(12.36, 12);
		obj.add(12.36, 12, 12);
		obj.add(12.36, 12);
		obj.add(12.23, 12, 12);
		

	}

}

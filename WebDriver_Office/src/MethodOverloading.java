
public class MethodOverloading {
	

	 void add(int a, int b){
		System.out.println(a+b);
		}
	
	void add(int a, int b,int c){
		System.out.println(a+b+c);
		}
	
	public static void main(String[] args) {
		MethodOverloading obj= new MethodOverloading();
		obj.add(2,44, 6);
	}

}

interface pribtable{
	void print();
	
}

class A6 implements pribtable{
	public void print(){System.out.println("Hello");}
}

public class Abstraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A6 obj=new A6();
		obj.print();

	}

}

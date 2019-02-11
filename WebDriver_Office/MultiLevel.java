/*class animals{
	void eat(){System.out.println("eating...");}
}

class Dogs extends Animals{
	void bark(){System.out.println("Barking");}
}*/
class Babydog extends Dog{
	void weep(){System.out.println("Weeping");}
}
public class MultiLevel {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Babydog obj= new Babydog();
		obj.eat();
		obj.bark();
		obj.weep();

	}

}

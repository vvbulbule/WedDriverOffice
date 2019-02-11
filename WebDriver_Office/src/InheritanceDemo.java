
class Inheritance {
	
	 void  eat(){
		System.out.println("eating");
	}

}

class Inheritance2 extends Inheritance {
	
	 void  bark(){
		System.out.println("barking");
	}

}

class Inheritance3 extends Inheritance {
	
	 void  weep(){
		System.out.println("weeping");
	}

}


public class InheritanceDemo {
	
	public static void main(String[] args) {
		Inheritance3 obj= new Inheritance3();
		
		//obj.bark();
		obj.eat();
		obj.weep();
	}
	
	
}
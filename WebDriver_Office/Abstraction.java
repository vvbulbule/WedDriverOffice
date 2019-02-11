 abstract class Bike{
	public void handle(){
		System.out.println("Bike has handle");
		//int a;
	}
	
	public void seat(){
		System.out.println("Bike has seat");
	}
	 abstract void engine();
	 abstract void wheels();
}

 class Herohonda extends Bike{

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("Bike has engine");
		
	}

	@Override
	public void wheels() {
		// TODO Auto-generated method stub
		System.out.println("Bike has wheels");
		
	}
	 
 }

 class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Herohonda obj= new Herohonda();
		obj.engine();
		obj.handle();
		obj.seat();
		obj.wheels();

	}

}

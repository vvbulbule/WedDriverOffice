
public abstract class abstracion {
	
	void engine(){
		System.out.println("This is engine");
	}
	
	abstract void wheel();
}

 class Implement extends abstracion {

	 
	 

		@Override
		void wheel() {
			// TODO Auto-generated method stub
			System.out.println("This is wheel");
			
		}
	
} 


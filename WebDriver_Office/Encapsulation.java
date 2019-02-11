public class Encapsulation {
	private String name= "Test Auto";

	public String getName(){
		return name;
	}
	
	public void setName(String NewName){
		name=NewName;
	}
	public static void main(String[] args) {
		Encapsulation obj= new Encapsulation();
		obj.setName("Selenium");
		System.out.println(obj.getName());
	}
	}


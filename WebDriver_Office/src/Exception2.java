
public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="abc";
		try{
			System.out.println(s1.length());
		}	
		catch(NullPointerException e){
			System.out.println("String is filled");
		}

	}

}
